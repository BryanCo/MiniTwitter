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
public class ShowPositiveTotalButton extends JPanel implements ActionListener,ShowTotalButton {

    private ShowPositveTotalController control;
    private JButton button;
    private String originalButtonText;
    
    ShowPositiveTotalButton(String buttonText, ShowPositveTotalController control) {
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
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.control.doAction();
        String b = this.originalButtonText + ": " + String.valueOf(this.control.getPositiveTotal());
        button.setText(b);
    }

}
