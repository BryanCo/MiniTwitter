package minitwitter;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Bryan
 */
public class UserWindow extends JFrame {
    
    UserWindow(TreeView tree){
        DefaultMutableTreeNode thisUser = (DefaultMutableTreeNode)tree.getSelectedNode();
        
        String windowTitle = "Mini Twitter - " + thisUser.toString();
        this.setTitle(windowTitle);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/4, dim.height/2);
        
        this.setVisible(true);
    }

}
