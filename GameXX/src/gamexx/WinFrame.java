/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexx;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author shira
 */
public class WinFrame extends JFrame implements ActionListener{

    public WinFrame() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTextField txt = new JTextField("Congratulation");
        txt.setBounds(200, 300, 150, 50);
        Color color = Color.RED;
        txt.setForeground(color);
        
        Font font = new Font("Courier", Font.BOLD,20);
        txt.setFont(font);
        this.add(txt);
        JButton win = new JButton(new ImageIcon("src\\Image\\22.png"));
        win.setBounds(100, 100, 100, 100);
        this.add(win);
        win.setActionCommand("OKKKK");
        win.addActionListener(this);
        JButton exit = new JButton("Exit");
        exit.setBounds(400, 100, 100, 100);
        this.add(exit);
        exit.setActionCommand("Exit");
        exit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("OKKKK".equals(ae.getActionCommand()))
                JOptionPane.showMessageDialog(this, "Nothing to do here! Please get back.");
        if ("Exit".equals(ae.getActionCommand()))
            System.exit(0);
    }
}
