package minitwitter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bryan
 * Creates a panel and textbox that refference a TextBoxController. This is a View component
 * of a MVC design pattern.
 */
public class TextBoxAction extends JPanel implements ActionListener {
    
    private TextBoxController control;
    private JButton button;
    private JTextField textBox;
    
    TextBoxAction(String textBoxText, String buttonText, TextBoxController control){
        this.setLayout(new GridLayout(1,2));
        this.control = control;
        
        this.textBox = new JTextField(textBoxText);
        this.button = new JButton(buttonText);
        
        this.add(textBox);
        this.add(button);
        
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.control.doAction(textBox);
    }

}
