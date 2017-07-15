package minitwitter;

import java.util.List;

/**
 *
 * @author Bryan
 * This is the class for the UserGroup.  Using the composite design pattern, it 
 * contains functions that are not nessicarily relevent to it.
 */
public class UserGroup implements User, Visitable {
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
    public void tweet(Tweet tweet){
        
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
