package minitwitter;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 */
public class ShowMessageTotalController {
    private int tweetTotal;
    private TreeView tree;
        
    ShowMessageTotalController(TreeView tree) {
        this.tree = tree;
    }

    public int getTweetTotal() {
        return tweetTotal;
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
        this.tweetTotal = visitor.getTweetTotal();
    }
}
