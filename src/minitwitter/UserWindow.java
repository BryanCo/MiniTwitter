package minitwitter;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 * This is the window for displaying individualUsers.
 */
public class UserWindow extends JFrame {
    IndividualUser thisUser;
    JTree followingTree;
    
    
    UserWindow(TreeView tree){
        DefaultMutableTreeNode thisNode = (DefaultMutableTreeNode)tree.getSelectedNode();
        try{
            this.thisUser = (IndividualUser)thisNode.getUserObject(); 
        }catch (ClassCastException e){
            return;
        }
        
        String windowTitle = "Mini Twitter - " + thisUser.toString();
        this.setTitle(windowTitle);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(4,1));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/4, dim.height/2);
        
        ListPanel followingPanel = new ListPanel("Following:");
        
        TextBoxController followUserControllerInstance = new FollowUserController(tree, thisUser, followingPanel);
        this.add(new TextBoxAction("UserID", "Follow User", followUserControllerInstance));
        
        this.add(followingPanel);
        
        TweetPanel tweetPanel = new TweetPanel("News Feed:");
        
        TextBoxController postTweetControllerInstance = new PostTweetController(tree, thisUser, tweetPanel);
        thisUser.addObserver((Observer)postTweetControllerInstance);
        this.add(new TextBoxAction("Tweet", "PostTweet", postTweetControllerInstance));
        this.add(tweetPanel);
        
        this.setVisible(true);
    }

}
