package minitwitter;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bryan
 */
public class NewTweetPost extends JPanel {
    NewTweetPost(){
        this.setLayout(new GridLayout(1,2));
        
        JTextField msg = new JTextField("Tweet Message");
        JButton postButton = new JButton("Post Tweet");
        
        this.add(msg);
        this.add(postButton);
    }

}
