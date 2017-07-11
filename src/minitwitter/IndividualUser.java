package minitwitter;

import java.util.List;



/**
 *
 * @author Bryan
 */
public class IndividualUser implements User {
    private String userID;
    private UserGroup group;
    private List<User> followers;
    private List<User> following;
    private List<Tweet> myTweets;
    private List<Tweet> newsFeed;
    
    IndividualUser(String userID){
        this.userID = userID;
    }
    @Override
    public void joinGroup(){
        
    }
    
    @Override
    public void followUser(){
        
    }
    
    @Override
    public void tweet(){
        
    }
    
    @Override
    public void notifyFollowers(){
        
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
}
