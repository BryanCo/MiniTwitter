package minitwitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author Bryan
 */
public class IndividualUser extends Observable implements User, Observer {
    private String userID;
    private Tweet recentTweet;
    private List<String> following = new ArrayList<String>();
    private List<Tweet> newsFeed = new ArrayList<>();
    
    IndividualUser(String userID){
        this.userID = userID;
    }
    @Override
    public void joinGroup(){
        
    }
    
    public List<Tweet> getNewsFeed(){
        return newsFeed;
    }
    
    public void addToIAmFollowing(String userName){
        following.add(userName);
    }
    
    public List<String> getIAmFollowing(){
        return following;
    }
    
    public Tweet getRecentTweet(){
        return recentTweet;
    }
    
    @Override
    public void tweet(Tweet tweet){
        newsFeed.add(tweet);
        this.recentTweet = tweet;
        notifyFollowers();
    }
    
    @Override
    public void notifyFollowers(){
        setChanged();
        String args = "followers";
        notifyObservers(args);
    }
    
    @Override
    public void updateNewsFeed(){
        
    }
    
    @Override
    public String toString(){
        return this.userID;
    }

    @Override
    public boolean isUserGroup() {
        return false;
    }

    @Override
    public void acceptMember() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void acceptFollower() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void update(Observable observable, Object arg)
    {

        if("followers".equals(arg)){
            IndividualUser user = (IndividualUser) observable;
            newsFeed.add(user.getRecentTweet());
            setChanged();
            String args = "controller";
            notifyObservers(args);
        }
        
    }

}
