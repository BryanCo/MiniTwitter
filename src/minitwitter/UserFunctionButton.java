package minitwitter;

import javax.swing.JButton;

/**
 *
 * @author Bryan
 */
public class UserFunctionButton extends ButtonPanel {
    
    String buttonText;
    UserFunctionController control;
    
    
    public UserFunctionButton(String buttonText, UserFunctionController control) {
        super(buttonText, control);
        this.buttonText = buttonText;
        this.control = control;
    }

    @Override
    public JButton getButton() {
        return super.getButton();
    }

    public UserFunctionController getControl() {
        return control;
    }
    

}
