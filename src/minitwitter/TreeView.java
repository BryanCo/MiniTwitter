package minitwitter;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Bryan
 */
abstract class TreeView extends JPanel implements TreeSelectionListener {
    protected JTree tree;
    protected DefaultMutableTreeNode selectedNode;
    
    TreeView(String treeName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(treeName);
        
        this.tree = new JTree(root);
        this.tree.setEditable(true);
        this.tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
        selectedNode = (DefaultMutableTreeNode)this.tree.getModel().getRoot();
        JScrollPane t = new JScrollPane(this.tree);
        this.tree.addTreeSelectionListener(this);
        this.setLayout(new BorderLayout());
        this.add(t,BorderLayout.CENTER);
    }
    
    public void addUser(String userID){}
    
    public void addNode(){
    }
    
    public JTree getTree(){
        return tree;
    }
    
    public DefaultMutableTreeNode getSelectedNode(){
        return selectedNode;
    }
    
    @Override
    public void valueChanged(TreeSelectionEvent se) {
        JTree selectTree = (JTree) se.getSource();
        this.selectedNode = (DefaultMutableTreeNode)
                selectTree.getLastSelectedPathComponent();
        
        //String selectedNodeName = selectedNode.toString();
        //if (selectedNode.isLeaf()) {
        //  System.out.println(selectedNodeName);
        //}
    }
}
