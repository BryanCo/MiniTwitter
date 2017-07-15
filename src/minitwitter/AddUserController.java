package minitwitter;

import javax.swing.JTextField;

/**
 *
 * @author Bryan
 * The controller for the Add User button and textbox in the Admin window.
 */
public class AddUserController extends TextBoxController {
    
    AddUserController(UserTree tree) {
        super(tree);
    }

    @Override
    public void doAction(JTextField textBox){
        tree.addUser(textBox.getText());
    }
}
