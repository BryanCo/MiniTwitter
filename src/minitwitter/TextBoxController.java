package minitwitter;

import javax.swing.JTextField;

/**
 *
 * @author Bryan
 */
abstract class TextBoxController {
    protected TreeView tree;
    
    TextBoxController(TreeView tree){
        this.tree = tree;
    }

    public void doAction(JTextField textBox){
        
    }
}
