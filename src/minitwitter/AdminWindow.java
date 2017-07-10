/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Bryan
 */
public class AdminWindow extends JFrame{
   
    AdminWindow(){        
        this.setTitle("Mini Twitter - Admin");
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/2, dim.height/2);
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); 
        this.setLayout(new GridLayout(1,2));
        
        this.add(new TreeView("root"));
        
        JPanel controlPanel = new JPanel(new GridLayout(3,1));
        controlPanel.add(new NewUserPanel());
        JButton openUsers = new JButton("Open User View");
        controlPanel.add(openUsers);
        controlPanel.add(new UserFunctionsPanel());
        
        this.add(controlPanel);
        
        this.setVisible(true);
    }
    
}
