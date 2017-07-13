package minitwitter;


/**
 *
 * @author Bryan
 */
public interface User {
    public void tweet(Tweet tweet);
    public boolean isUserGroup();
    public void notifyFollowers();
    public void updateNewsFeed();
    public void joinGroup();
    public void acceptMember();
    public void acceptFollower();
}
