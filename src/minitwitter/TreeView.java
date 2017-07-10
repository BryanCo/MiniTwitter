/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Bryan
 */
public class TreeView extends JScrollPane {
    
    TreeView(String treeName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(treeName);
        
        JTree tree = new JTree(root);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
    }
}
