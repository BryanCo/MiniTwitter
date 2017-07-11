package minitwitter;

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
        if(!selectedNode.isLeaf()){
            selectedNode.add(new DefaultMutableTreeNode(new IndividualUser(userID)));
        }else{
            root.add(new DefaultMutableTreeNode(new IndividualUser(userID)));
        }
        model.reload(root);
    }
    
    public void addUserToGroup(){
        
    }
    
    public void moveUserToGroup(){
        
    }

}
