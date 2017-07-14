package minitwitter;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class UserFunctionsPanel extends JPanel {
    
    private TreeView tree;
    
    UserFunctionsPanel(TreeView tree){
        this.tree = tree;
        this.setLayout(new GridLayout(2,2));
        
        ShowUserTotalController showUserTotalController = new ShowUserTotalController(this.tree);
        this.add(new ShowUserTotalButton("Show User Total", showUserTotalController));
        
        ShowGroupTotalController showGroupTotalController = new ShowGroupTotalController(this.tree);
        this.add(new ShowGroupTotalButton("Show Group Total", showGroupTotalController));

        ShowMessageTotalController showMessageTotalController = new ShowMessageTotalController(this.tree);
        this.add(new ShowMessageTotalButton("Show Messages Total", showMessageTotalController));
        
        ShowPositveTotalController showPositveTotalController = new ShowPositveTotalController(this.tree);
        this.add(new ShowPositiveTotalButton("Show Messages Total", showPositveTotalController));
    }
    
}
