package minitwitter;

/**
 *
 * @author Bryan
 */
public class StringTweet implements Tweet {
    
    String tweet;
    
    StringTweet(String user, String msg){
        this.tweet = user + ": " + msg;
    }
    
    public String getTweet(){
        return tweet;
    }
}
