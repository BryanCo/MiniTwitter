package minitwitter;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 */
public class ShowUserTotalController {
    
    private int userTotal;
    TreeView tree;
    
    ShowUserTotalController(TreeView tree) {
        this.tree = tree;
    }

    public int getUserTotal(){
        return userTotal;
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
        this.userTotal = visitor.getUserTotal();
    }
}
