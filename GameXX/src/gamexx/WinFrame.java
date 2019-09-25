/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexx;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author shira
 */
public class WinFrame extends JFrame {

    public WinFrame() {
        setSize(600, 600);
        setLocationRelativeTo(null);
//        JButton win = new JButton("YOU WIN");
        JTextField txt = new JTextField();
        txt.setText("Nhap gi do...");
        add(txt);
    }
}
