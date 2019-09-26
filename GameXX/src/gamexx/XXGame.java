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
import javafx.scene.paint.Color;
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

    ArrayList<JButton> btnArr = new ArrayList<>();
    JLabel lbCount = new JLabel();

    public XXGame() {
        setSize(510, 600);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        createButton();

        lbCount.setText("Tim vi tri kho bau tren map");
        Font font = new Font("Courier", Font.BOLD,20);
        lbCount.setFont(font);
        lbCount.setBounds(10, 500, 400, 80);
        add(lbCount);
        for (int i = 0; i < 25; i++) {
            btnArr.get(i).setName("notEnd");
        }
        end = (int) (Math.random() * 25);
        endX = (int) (Math.random() * 25);
        endY = (int) (Math.random() * 25);
        while (end == endX || end == endY || endX == endY) {
            end = (int) (Math.random() * 25);
            endX = (int) (Math.random() * 25);
            endY = (int) (Math.random() * 25);
        }
        System.out.println(end);
        System.out.println(endX);
        System.out.println(endY);
        btnArr.get(end).setName("End");
        btnArr.get(endX).setName("endX");
        btnArr.get(endY).setName("endY");
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

            } else if (name == "endX" || name == "endY") {
                btnArr.get(i).addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        setVisible(false);
                        new Lose().setVisible(true);
                    }

                });

            } else {
                btnArr.get(i).addActionListener(new ABCEvent(btnArr.get(i), notEnd, i));
            }

        }
    }
}

class ABCEvent implements ActionListener {

    JButton btn;
    ImageIcon notEnd;
    int i;

    public ABCEvent(JButton btn, ImageIcon notEnd, int i) {
        this.btn = btn;
        this.notEnd = notEnd;
        this.i = i;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        btn.setIcon(notEnd);
    }
}
