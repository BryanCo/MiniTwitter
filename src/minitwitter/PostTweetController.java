package minitwitter;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JTextField;

/**
 *
 * @author Bryan
 */
public class PostTweetController extends TextBoxController implements Observer {

    private IndividualUser thisUser;
    private TweetPanel tweetPanel;
    
    public PostTweetController(TreeView tree, IndividualUser thisUser, TweetPanel tweetPanel) {
        super(tree);
        this.thisUser = thisUser;
        this.tweetPanel = tweetPanel;
    }

    @Override
    public void doAction(JTextField textBox){
        this.thisUser.tweet(new StringTweet(this.thisUser.toString(), textBox.getText()));
        tweetPanel.update(this.thisUser.getNewsFeed());
    }

    @Override
    public void update(Observable o, Object o1) {
        if("controller".equals(o1)){
            tweetPanel.update(this.thisUser.getNewsFeed());
        }
    }
    
}
