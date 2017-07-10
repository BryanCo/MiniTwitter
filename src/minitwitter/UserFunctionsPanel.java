package minitwitter;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class UserFunctionsPanel extends JPanel {
    
    UserFunctionsPanel(){
        this.setLayout(new GridLayout(2,2));
        
        JButton showUserTotal = new JButton("Show User Total");
        JButton showGroupTotal = new JButton("Show Group Total");
        JButton showMessagesTotal = new JButton("Show Messages Total");
        JButton showPositivePercentage = new JButton("Show Positive Percentage");
        
        this.add(showUserTotal);
        this.add(showGroupTotal);
        this.add(showMessagesTotal);
        this.add(showPositivePercentage);
    }
    
}
