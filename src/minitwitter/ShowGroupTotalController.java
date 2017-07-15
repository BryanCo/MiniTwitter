package minitwitter;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 * Controller for the "Show Group Total" button.
 */
public class ShowGroupTotalController {
    private int groupTotal;
    private TreeView tree;
        
    ShowGroupTotalController(TreeView tree) {
        this.tree = tree;
    }

    public int getGroupTotal() {
        return groupTotal;
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
            } catch(ClassCastException ea){
                //System.out.println((String)needle.getUserObject());
            }
            
        }
        this.groupTotal = visitor.getGroupTotal();
    }
}
