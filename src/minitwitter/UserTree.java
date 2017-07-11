package minitwitter;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Bryan
 */
public class UserTree extends TreeView{
    
    public UserTree(String treeName) {
        super(treeName);
    }
    
    @Override
    public void addUser(String userID){
        DefaultTreeModel model = (DefaultTreeModel)tree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
        root.add(new DefaultMutableTreeNode(new IndividualUser(userID)));
        model.reload(root);
    }
    
    public void addUserToGroup(){
        
    }
    
    public void moveUserToGroup(){
        
    }

}
