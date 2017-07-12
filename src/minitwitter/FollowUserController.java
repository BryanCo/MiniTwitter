package minitwitter;

import java.util.Enumeration;
import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 */
public class FollowUserController extends TextBoxController {
    
    public FollowUserController(TreeView tree) {
        super(tree);
    }
    
    @Override
    public void doAction(JTextField textBox){
       DefaultMutableTreeNode root = (DefaultMutableTreeNode)this.tree.getTree().getModel().getRoot();
       Enumeration e = root.preorderEnumeration();
       while(e.hasMoreElements()){
           if(e.nextElement().toString().equals(textBox.getText())){
               IndividualUser needle = (IndividualUser)e.nextElement();
           }
       }
       //TODO:Finish Logic
       
    }
}
