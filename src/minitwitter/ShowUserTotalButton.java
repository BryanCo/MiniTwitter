package minitwitter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class ShowUserTotalButton  extends JPanel implements ActionListener {
    
    private ShowUserTotalController control;
    private JButton button;
    private String originalButtonText;
    
    public ShowUserTotalButton(String buttonText, ShowUserTotalController control) {
        this.control = control;
        this.button = new JButton(buttonText);
        this.originalButtonText = buttonText;
        
        this.setLayout(new BorderLayout());
        this.add(this.button,BorderLayout.CENTER);
        
        this.add(button);
        
        button.addActionListener(this);
    }
    
    public JButton getButton(){
        return button;
    }
    
    public void actionPerformed(ActionEvent ae) {
        this.control.doAction();
        String b = this.originalButtonText + ": " + this.control.getUserTotal();
        button.setText(b);
    }
    
}
