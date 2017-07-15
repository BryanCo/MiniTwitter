package minitwitter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 * Creates a the "Show Group Total" button.
 * This is a bit of a bodge that I would like to revisit when less time constrained.
 * Ideally a single class would work for all four buttons, but the code would
 * not work the way I was trying to implement it.
 */
public class ShowGroupTotalButton extends JPanel implements ActionListener,ShowTotalButton {
    
    private ShowGroupTotalController control;
    private JButton button;
    private String originalButtonText;
    
    ShowGroupTotalButton(String buttonText, ShowGroupTotalController control) {
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
        String b = this.originalButtonText + ": " + this.control.getGroupTotal();
        button.setText(b);
    }

}
