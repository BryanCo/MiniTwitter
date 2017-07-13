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
public class TweetPanel extends JPanel {
    
    private JTree tree;
    private DefaultTreeModel model;
    private DefaultMutableTreeNode root;
    private String name;
    
    TweetPanel(String name){
        this.name = name;
        this.root = new DefaultMutableTreeNode(this.name);
        this.tree = new JTree(root);
        this.tree.setEditable(true);
        this.model = (DefaultTreeModel)tree.getModel();
        
        JScrollPane t = new JScrollPane(this.tree);
        this.setLayout(new BorderLayout());
        this.add(t,BorderLayout.CENTER);
    }
    
    public void update(List<Tweet> list){
        this.root = new DefaultMutableTreeNode(this.name);
        for(Tweet s: list){
            DefaultMutableTreeNode n = new DefaultMutableTreeNode(s.getTweet());
            this.root.add(n);
        }
        this.model.setRoot(root);
    }
}
