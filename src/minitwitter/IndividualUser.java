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
    public void joinGroup(){
        
    }
    
    public void followUser(){
        
    }
    
    public void tweet(){
        
    }
    
    public void notifyFollowers(){
        
    }
    
    public void updateNewsFeed(){
        
    }
    
    @Override
    public String toString(){
        return this.userID;
    }
}
