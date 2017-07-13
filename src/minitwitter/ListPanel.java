package minitwitter;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Bryan
 */
public class ListPanel extends JPanel {
    
    private JTree tree;
    private DefaultTreeModel model;
    private DefaultMutableTreeNode root;
    private String name;
    
    ListPanel(String name){
        this.name = name;
        this.root = new DefaultMutableTreeNode(this.name);
        this.tree = new JTree(root);
        this.tree.setEditable(true);
        this.model = (DefaultTreeModel)tree.getModel();
        
        JScrollPane t = new JScrollPane(this.tree);
        this.setLayout(new BorderLayout());
        this.add(t,BorderLayout.CENTER);
    }
    
    public void update(List<String> list){
        this.root = new DefaultMutableTreeNode(this.name);
        for(String s: list){
            DefaultMutableTreeNode n = new DefaultMutableTreeNode(s);
            this.root.add(n);
        }
        this.model.setRoot(root);
    }
    
}