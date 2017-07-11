package minitwitter;

/**
 *
 * @author Bryan
 */
public class GenericTweet implements Tweet {
    private String message;
    
    GenericTweet(String msg){
        this.message = msg;
    }
    
    public String getTweet(){
        return this.message;
    }
}
