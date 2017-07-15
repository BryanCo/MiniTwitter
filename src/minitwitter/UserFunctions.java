package minitwitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Bryan
 * 
 */
public class UserFunctions implements Visitor {
    private int userTotal = 0;
    private int groupTotal = 0;
    private int tweetTotal = 0;
    private int positiveTotal = 0;
    List<String> positiveWords = new ArrayList<>(Arrays.asList("good", "great", "excellent"));
    
    public int getUserTotal() {
        return userTotal;
    }

    public int getGroupTotal() {
        return groupTotal;
    }

    public int getTweetTotal() {
        return tweetTotal;
    }

    public int getPositiveTotal() {
        return positiveTotal;
    }

    
    @Override
    public void visit(IndividualUser individualUser) {
        userTotal++;
        List<Tweet> tweets = individualUser.getMyTweets();
        tweetTotal += tweets.size();
        for(Tweet t : tweets){
            for(String s : positiveWords){
                if(t.getTweet().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(s);
                    positiveTotal++;
                }
            }
            
        }
    }

    @Override
    public void visit(UserGroup userGroup) {
        groupTotal++;
    }

}
