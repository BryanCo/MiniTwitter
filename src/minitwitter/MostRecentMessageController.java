package minitwitter;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 * Controller for the "Show Message Total" button.
 * 
 */
public class MostRecentMessageController {
    private String mostRecentUpdate;
    private TreeView tree;
        
    MostRecentMessageController(TreeView tree) {
        this.tree = tree;
    }

    public String getMostRecentUpdate() {
        return mostRecentUpdate;
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
        this.mostRecentUpdate = visitor.getMostRecentUpdate();
    }
}
