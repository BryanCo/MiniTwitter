package minitwitter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author Bryan
 * Is a User representing an individual user in this program.  Has to observe other
 * IndividualUsers as well as be observable (Observer design pattern). Needs to 
 * be Visitable by the user total functions (visitor pattern).
 */
public class IndividualUser extends Observable implements User, Observer, Visitable {
    private String userID;
    private Tweet recentTweet;
    private List<String> following = new ArrayList<String>();
    private List<Tweet> newsFeed = new ArrayList<>();
    private List<Tweet> myTweets = new ArrayList<>();
    private long creationTime;
    private long lastUpdateTime;
    
    IndividualUser(String userID){
        this.userID = userID;
        this.creationTime = System.currentTimeMillis();
    }
    @Override
    public void joinGroup(){
        
    }
    
    public List<Tweet> getNewsFeed(){
        return this.newsFeed;
    }
    
    public List<Tweet> getMyTweets(){
        return this.myTweets;
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

    public long getCreationTime() {
        return creationTime;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }
    
    @Override
    public void tweet(Tweet tweet){
        this.newsFeed.add(tweet);
        this.myTweets.add(tweet);
        this.recentTweet = tweet;
        this.lastUpdateTime = System.currentTimeMillis();
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

    public String idWithTime(){
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String dateFormatted = formatter.format(creationTime);
        String s = this.userID + ": " + dateFormatted;
        return s;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
  }

}
