package minitwitter;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bryan
 */
public class NewUserPanel extends JPanel {
    
    NewUserPanel(){
        this.setLayout(new GridLayout(2,2));
        
        JTextField userID = new JTextField("UserID");
        JButton addUser = new JButton("Add User");
        JTextField groupID = new JTextField("Group ID");
        JButton addGroup = new JButton("Add Group");
        
        this.add(userID);
        this.add(addUser);
        this.add(groupID);
        this.add(addGroup);
        
    }
    
}
