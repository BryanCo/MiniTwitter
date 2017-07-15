package minitwitter;

import javax.swing.JTextField;

/**
 *
 * @author Bryan
 * The controller for the Add Group button and textbox in the Admin window.
 */
public class AddGroupController extends TextBoxController {
    
    public AddGroupController(UserTree tree) {
        super(tree);
    }
    
    @Override
    public void doAction(JTextField textBox){
        tree.addGroup(textBox.getText());
    }
}
