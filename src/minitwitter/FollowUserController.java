package minitwitter;

import java.util.Enumeration;
import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 */
public class FollowUserController extends TextBoxController {
    private IndividualUser thisUser;
    private ListPanel listPanel;
    
    FollowUserController(TreeView tree, IndividualUser thisUser, ListPanel listPanel) {
        super(tree);
        this.thisUser = thisUser;
        this.listPanel = listPanel;
        listPanel.update(thisUser.getIAmFollowing());
    }
    
    @Override
    public void doAction(JTextField textBox){
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)this.tree.getTree().getModel().getRoot();
        Enumeration e = root.preorderEnumeration();
        while(e.hasMoreElements()){
            Object o = e.nextElement();
            if(o.toString().equals(textBox.getText())){
                DefaultMutableTreeNode needle = (DefaultMutableTreeNode)o;
                IndividualUser userToFollow = (IndividualUser)needle.getUserObject();
                userToFollow.addObserver(this.thisUser);
                this.thisUser.addToIAmFollowing(userToFollow.toString());
                
                //for(String s : this.thisUser.getIAmFollowing()){
                //    System.out.println(s);
                //}
                listPanel.update(this.thisUser.getIAmFollowing());
            }
        }
    }
}
