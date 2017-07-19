package minitwitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private boolean allIDValid = true;
    private long mostRecentUpdate = 0;
    private String mostRecentUpdateUser;
    private List<String> positiveWords = new ArrayList<>(Arrays.asList("good", "great", "excellent"));
    private List<String> userIDs = new ArrayList<>(); 
    
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

    public boolean isAllIDValid() {
        return allIDValid;
    }

    public String getMostRecentUpdate() {
        return this.mostRecentUpdateUser;
    }
    
    private boolean validateUserID(String userID, List<String> otherUserIDs){
        Boolean value = (!userID.contains(" ") && !otherUserIDs.contains((String)userID));
        return value;
    }
    
    @Override
    public void visit(IndividualUser individualUser) {
        userTotal++;
        List<Tweet> tweets = individualUser.getMyTweets();
        tweetTotal += tweets.size();
        this.allIDValid = validateUserID(individualUser.toString(), this.userIDs);
        this.userIDs.add(individualUser.toString());
        if(individualUser.getLastUpdateTime() > mostRecentUpdate){
            mostRecentUpdate = individualUser.getLastUpdateTime();
            this.mostRecentUpdateUser = individualUser.toString();
        }
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
        this.allIDValid = validateUserID(userGroup.toString(), this.userIDs);
        this.userIDs.add(userGroup.toString());
    }

}
