package minitwitter;


/**
 *
 * @author Bryan
 * Interface for the IndividualUser and UserGroup.
 */
public interface User extends Visitable{
    public void tweet(Tweet tweet);
    public boolean isUserGroup();
    public void notifyFollowers();
    public void updateNewsFeed();
    public void joinGroup();
    public void acceptMember();
    public void acceptFollower();
    @Override
    public void accept(Visitor visitor); 
}
