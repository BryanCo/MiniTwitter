package minitwitter;

/**
 *
 * @author Bryan
 * A tweet that stores a tweet with a string. Containing the Username and the message.
 */
public class StringTweet implements Tweet {
    
    String tweet;
    
    StringTweet(String user, String msg){
        this.tweet = user + ": " + msg;
    }
    
    @Override
    public String getTweet(){
        return tweet;
    }
}
