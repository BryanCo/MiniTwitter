package minitwitter;

import javax.swing.JTextField;

/**
 *
 * @author Bryan
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
