/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class JavaApplication18 {
    static int x, y;// co-ordinate
    static int endX, endY;
    static final int LENGTH = 4;

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        endX = (int) (Math.random() * LENGTH);
        endY = (int) (Math.random() * LENGTH);
        // Math.random() => return 0.0 <= float value < 1
        x = 2;
        y = 2;
        while (true) {
            show();
            String vuanhap = input();
            move(vuanhap);
            boolean ketqua = check();
            if (ketqua == true) {
                System.out.println("Thang roi");
                break;
            }
            System.out.println("=========================");
        }
    }

    static void show() {
        for (int YY = 0; YY < LENGTH; YY++) {
            for (int XX = 0; XX < LENGTH; XX++) {
                if (XX == x && YY == y) {
                    System.out.print("X ");
                } else if (XX == endX && YY == endY) {
                    System.out.print("O ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    static String input() {
        System.out.println("Nhap vao: WASD");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    static void move(String vuaNhap) {
        switch (vuaNhap) {
            case "A":
                if (x > 0) {
                    x = x - 1;
                }
                break;
            case "D":
                if (x < LENGTH - 1) {
                    x = x + 1;
                }
                break;
            case "W":
                if (y > 0) {
                    y = y - 1;
                }
                break;
            case "S":
                if (y < LENGTH - 1) {
                    y = y + 1;
                }
                break;
            default:
                System.out.println("Ki tu nhap khong hop le ");
        }
    }

    static boolean check() {
        if (x == endX && y == endY) {
            return true;
        }
        return false;
    }

}
