package minitwitter;

import java.util.List;

/**
 *
 * @author Bryan
 */
public class UserGroup implements User {
    private String userID;
    private List<User> members;
    private List<User> followers;
    
    UserGroup(String groupName){
        this.userID = groupName;
    }
    
    @Override
    public boolean isUserGroup(){
        return true;
    }
    
    @Override
    public String toString(){
        return this.userID;
    }
    
    @Override
    public void acceptMember(){
        
    }
    
    @Override
    public void acceptFollower(){
        
    }
    
    @Override
    public void tweet(){
        
    }

    @Override
    public void followUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyFollowers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNewsFeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void joinGroup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
