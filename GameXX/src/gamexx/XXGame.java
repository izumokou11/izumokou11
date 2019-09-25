/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexx;

import static gamexx.XXGame.count;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author shira
 */
public class XXGame extends JFrame {

    public static void main(String[] args) {
        new XXGame().setVisible(true);;
    }
    static int endX, endY;
    static int x, y;
    static final int LENGTH = 5;
    static int[][] map = new int[LENGTH][LENGTH];
    static int end;
    static int count = 7;
//    JButton btn1 = new JButton();
//    JButton btn2 = new JButton();
//    JButton btn3 = new JButton();
//    JButton btn4 = new JButton();
//    JButton btn5 = new JButton();
//    JButton btn6 = new JButton();
//    JButton btn7 = new JButton();
//    JButton btn8 = new JButton();
//    JButton btn9 = new JButton();
//    JButton btn10 = new JButton();
//    JButton btn11 = new JButton();
//    JButton btn12 = new JButton();
//    JButton btn13 = new JButton();
//    JButton btn14 = new JButton();
//    JButton btn15 = new JButton();
//    JButton btn16 = new JButton();
//    JButton btn17 = new JButton();
//    JButton btn18 = new JButton();
//    JButton btn19 = new JButton();
//    JButton btn20 = new JButton();
//    JButton btn21 = new JButton();
//    JButton btn22 = new JButton();
//    JButton btn23 = new JButton();
//    JButton btn24 = new JButton();
//    JButton btn25 = new JButton();
    ArrayList<JButton> btnArr = new ArrayList<>();
    JLabel lbCount = new JLabel();

    public XXGame() {
        setSize(600, 600);
        setLocationRelativeTo(null);
       
        setLayout(null);
        createButton();

        lbCount.setText(String.valueOf(count));
        lbCount.setBounds(10, 510, 50, 80);
        add(lbCount);
        for (int i = 0; i < 25; i++) {
            btnArr.get(i).setName("notEnd");
        }
        end = (int) (Math.random() * 25);
        System.out.println(end);
        btnArr.get(end).setName("End");
        addEvent();
    }

    private void createButton() {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                JButton a = new JButton();
                a.setBounds(x, y, 100, 100);
                btnArr.add(a);

                x = x + 100;
            }
            x = 0;
            y = y + 100;
        }
        for (int i = 0; i < 25; i++) {
            add(btnArr.get(i));
        }

//        btn1.setBounds(0, 0, 100, 100);
//        add(btn1);
//
//        btn2.setBounds(100, 0, 100, 100);
//        add(btn2);
//
//       
//        btn3.setBounds(200, 0, 100, 100);
//        add(btn3);
//
//       
//        btn4.setBounds(300, 0, 100, 100);
//        add(btn4);
//
//        
//        btn5.setBounds(400, 0, 100, 100);
//        add(btn5);
//
//       
//        btn6.setBounds(0, 100, 100, 100);
//        add(btn6);
//
//       
//        btn7.setBounds(100, 100, 100, 100);
//        add(btn7);
//
//     
//        btn8.setBounds(200, 100, 100, 100);
//        add(btn8);
//
//       
//        btn9.setBounds(300, 100, 100, 100);
//        add(btn9);
//
//       
//        btn10.setBounds(400, 100, 100, 100);
//        add(btn10);
//
//       
//        btn11.setBounds(0, 200, 100, 100);
//        add(btn11);
//
//      
//        btn12.setBounds(100, 200, 100, 100);
//        add(btn12);
//
//        
//        btn13.setBounds(200, 200, 100, 100);
//        add(btn13);
//
//        
//        btn14.setBounds(300, 200, 100, 100);
//        add(btn14);
//
//       
//        btn15.setBounds(400, 200, 100, 100);
//        add(btn15);
//
//     
//        btn16.setBounds(0, 300, 100, 100);
//        add(btn16);
//
//      
//        btn17.setBounds(100, 300, 100, 100);
//        add(btn17);
//
//     
//        btn18.setBounds(200, 300, 100, 100);
//        add(btn18);
//
//      
//        btn19.setBounds(300, 300, 100, 100);
//        add(btn19);
//
//        
//        btn20.setBounds(400, 300, 100, 100);
//        add(btn20);
//
//        
//        btn21.setBounds(0, 400, 100, 100);
//        add(btn21);
//
//       
//        btn22.setBounds(100, 400, 100, 100);
//        add(btn22);
//
//      
//        btn23.setBounds(200, 400, 100, 100);
//        add(btn23);
//
//       
//        btn24.setBounds(300, 400, 100, 100);
//        add(btn24);
//
//        
//        btn25.setBounds(400, 400, 100, 100);
//        add(btn25);
    }

    private void addEvent() {
        for (int i = 0; i < 25; i++) {
            String name = btnArr.get(i).getName();
            final ImageIcon notEnd = new ImageIcon("src\\Image\\2.png");
            if (name == "End") {
                btnArr.get(i).addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        setVisible(false);
                        new WinFrame().setVisible(true);
                    }
                });

            } else {
                btnArr.get(i).addActionListener(new ABCEvent(btnArr.get(i), notEnd, i,lbCount));
            }

        }
    }
}

class ABCEvent implements ActionListener {

    JButton btn;
    ImageIcon notEnd;
    JLabel lbCount;
    int i;

    public ABCEvent(JButton btn, ImageIcon notEnd, int i, JLabel lbCount) {
        this.btn = btn;
        this.notEnd = notEnd;
        this.i = i;
        this.lbCount = lbCount;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        btn.setIcon(notEnd);
        count--;
        if (count == 0) {
            System.out.println("You Lose");

        }

        lbCount.setText(String.valueOf(count));
    }
}
