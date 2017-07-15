package minitwitter;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Bryan
 * This is the tree displayed in the Admin window.  I also doubles as the data 
 * model storing all users.
 */
public class UserTree extends TreeView{
    DefaultTreeModel model;
    DefaultMutableTreeNode root;
    
    public UserTree(String treeName) {
        super(treeName);
        this.model = (DefaultTreeModel)super.getTree().getModel();
        this.root = (DefaultMutableTreeNode)model.getRoot();
    }
    
    @Override
    public void addUser(String userID){
        User o;
        try{
            o = (User)super.getSelectedNode().getUserObject();
        }catch (ClassCastException e){
            o = new IndividualUser("root");
        }
        if(o.isUserGroup()){
            super.getSelectedNode().add(new DefaultMutableTreeNode(new IndividualUser(userID)));
        }else{
            DefaultMutableTreeNode n = (DefaultMutableTreeNode)super.getSelectedNode().getParent();
            try{
                n.add(new DefaultMutableTreeNode(new IndividualUser(userID)));
            } catch (NullPointerException e){
                this.root.add(new DefaultMutableTreeNode(new IndividualUser(userID)));
            }
        }
        this.model.reload(this.root);
    }
    
    @Override
    public void addGroup(String groupName){
        User o;
        try{
            o = (User)super.getSelectedNode().getUserObject();
        }catch (ClassCastException e){
            o = new IndividualUser("root");
        }
        if(o.isUserGroup()){
            super.getSelectedNode().add(new DefaultMutableTreeNode(new UserGroup(groupName)));
        } else{
            DefaultMutableTreeNode n = (DefaultMutableTreeNode)super.getSelectedNode().getParent();
            try{
                n.add(new DefaultMutableTreeNode(new UserGroup(groupName)));
            }catch (NullPointerException e){
                this.root.add(new DefaultMutableTreeNode(new UserGroup(groupName)));
            }
        }
        this.model.reload(this.root);
    }

}
