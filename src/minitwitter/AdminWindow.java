package minitwitter;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class AdminWindow extends JFrame{
    UserTree tree;
    private static AdminWindow win = null; 
    
    private AdminWindow(){        
        this.setTitle("Mini Twitter - Admin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/2, dim.height/2);
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); 
        this.setLayout(new GridLayout(1,2));
        
        this.tree = new UserTree("root");
        
        this.add(tree);
        
        JPanel controlPanel = new JPanel(new GridLayout(4,1));
        
        TextBoxController addUserControllerInstance = new AddUserController(this.tree);
        controlPanel.add(new TextBoxAction("UserID", "Add User", addUserControllerInstance));
        
        TextBoxController addGroupControllerInstance = new AddGroupController(this.tree);
        controlPanel.add(new TextBoxAction("Group Name", "Add Group", addGroupControllerInstance));
        
        ButtonPanelController openUserControllerInstance = new OpenUserController(this.tree);
        ButtonPanel openUsers = new ButtonPanel("Open User View", openUserControllerInstance);
        
        controlPanel.add(openUsers);
        controlPanel.add(new UserFunctionsPanel(this.tree));
        
        this.add(controlPanel);
        
        this.setVisible(true);
    }
    
    public static AdminWindow getInstance(){
        if(win == null){
            synchronized(AdminWindow.class){
                if(win==null){
                    win = new AdminWindow();
                }
            }
        }
        return win;
    }
}
