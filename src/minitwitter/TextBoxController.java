package minitwitter;

import javax.swing.JTextField;

/**
 *
 * @author Bryan
 * Abstract class for a panel with a textbox and button.
 */
abstract class TextBoxController implements ControllerInterface {
    protected TreeView tree;
    
    TextBoxController(TreeView tree){
        this.tree = tree;
    }

    public void doAction(JTextField textBox){
        
    }
}
