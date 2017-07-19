package minitwitter;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 * Creates the panel with "Show User Total", "Show Group Total", "Show Messages Total",
 * "Show Messages Total" buttons and their controllers.
 * 
 * TODO: When I tried to program to the ShowTotalButton interface the code would
 * work.  Ideally the four controller instantiations would be stored in ShowTotalButton
 * variables.
 * 
 */
public class UserFunctionsPanel extends JPanel {
    
    private TreeView tree;
    
    UserFunctionsPanel(TreeView tree){
        this.tree = tree;
        this.setLayout(new GridLayout(3,2));
        
        ShowUserTotalController showUserTotalController = new ShowUserTotalController(this.tree);
        this.add(new ShowUserTotalButton("Show User Total", showUserTotalController));
        
        ShowGroupTotalController showGroupTotalController = new ShowGroupTotalController(this.tree);
        this.add(new ShowGroupTotalButton("Show Group Total", showGroupTotalController));

        ShowMessageTotalController showMessageTotalController = new ShowMessageTotalController(this.tree);
        this.add(new ShowMessageTotalButton("Show Messages Total", showMessageTotalController));
        
        ShowPositveTotalController showPositveTotalController = new ShowPositveTotalController(this.tree);
        this.add(new ShowPositiveTotalButton("Show Messages Total", showPositveTotalController));
        
        ValidationController validationController = new ValidationController(this.tree);
        this.add(new ValidationButton("Are all UserIDs valid?", validationController));
        
        MostRecentMessageController mostRecentMessageController = new MostRecentMessageController(this.tree);
        this.add(new MostRecentMessageButton("User most recently active", mostRecentMessageController));
        
    }
    
}
