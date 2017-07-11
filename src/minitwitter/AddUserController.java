package minitwitter;

import javax.swing.JTextField;

/**
 *
 * @author Bryan
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
