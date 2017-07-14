/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Bryan
 */
public interface ShowTotalButton {
    public JButton getButton();
    public void actionPerformed(ActionEvent ae);
}
