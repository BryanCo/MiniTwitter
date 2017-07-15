package minitwitter;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Bryan
 * The interface for the user function buttons.
 */
public interface ShowTotalButton {
    public JButton getButton();
    public void actionPerformed(ActionEvent ae);
}
