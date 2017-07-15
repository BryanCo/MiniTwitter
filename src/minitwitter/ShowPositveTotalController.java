package minitwitter;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 * Controller for the "Show Positive Total" button.
 */
public class ShowPositveTotalController {
    private int positiveTotal;
    private int messageTotal;
    private TreeView tree;
        
    ShowPositveTotalController(TreeView tree) {
        this.tree = tree;
    }

    public double getPositiveTotal() {
        return ((double)this.positiveTotal/(double)this.messageTotal) *100;
    }
    
    public void doAction() {
        UserFunctions visitor = new UserFunctions();
        
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)this.tree.getTree().getModel().getRoot();
        Enumeration e = root.preorderEnumeration();
        while(e.hasMoreElements()){
            DefaultMutableTreeNode needle = (DefaultMutableTreeNode)e.nextElement();
            try{
                User user = (User)needle.getUserObject();
                user.accept(visitor);
            } catch(ClassCastException ea){}
        }
        this.positiveTotal = visitor.getPositiveTotal();
        this.messageTotal = visitor.getTweetTotal();
    }
}
