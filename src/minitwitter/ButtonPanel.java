package minitwitter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 * A panel with a button that references a ButtonPanelController
 */
public class ButtonPanel extends JPanel implements ActionListener {
    private ButtonPanelController control;
    private JButton button;
    
    ButtonPanel(String buttonText, ButtonPanelController control){
        this.control = control;
        this.button = new JButton(buttonText);
        
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
        control.doAction();
    }

}
