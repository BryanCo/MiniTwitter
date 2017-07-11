package minitwitter;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bryan
 */
public class FollowUser extends JPanel {
    FollowUser(){
        this.setLayout(new GridLayout(1,2));
        
        JTextField userID = new JTextField("UserID");
        JButton addUser = new JButton("Follow User");
        
        this.add(userID);
        this.add(addUser);
    }

}
