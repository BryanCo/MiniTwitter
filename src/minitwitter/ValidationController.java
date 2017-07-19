package minitwitter;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 * Controller for the "Show Message Total" button.
 * 
 */
public class ValidationController {
    private boolean allUsersValid;
    private TreeView tree;
        
    ValidationController(TreeView tree) {
        this.tree = tree;
    }

    public boolean allUserIdsValid() {
        return allUsersValid;
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
        this.allUsersValid = visitor.isAllIDValid();
    }
}
