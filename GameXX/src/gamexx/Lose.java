/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author shira
 */
public class Lose extends JFrame implements ActionListener{

    public Lose() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JTextField Loser1 = new JTextField("" , JTextField.CENTER);
        Loser1.setBounds(65, 320,500, 50);
        Loser1.setText("Dude, you're going the wrong way");
        Font font = new Font("Courier", Font.BOLD,30);
        Loser1.setFont(font);
        Loser1.setBackground(Color.white);
        Loser1.setForeground(Color.black);
        this.add(Loser1);
        Loser1.setLayout(new FlowLayout());
        JButton exit = new JButton("Exit");
        exit.setBounds(200, 400, 100, 100);
        this.add(exit);
        exit.setActionCommand("Exit");
        exit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if("Exit".equals(ae.getActionCommand())){
            System.exit(0);
        }
    }
}
