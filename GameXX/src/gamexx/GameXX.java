/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexx;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class GameXX {

    static int endX, endY;
    static int x, y;
    static final int LENGTH = 5;
    static int map[][];
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        endX = (int) (Math.random() * LENGTH);
        endY = (int) (Math.random() * LENGTH);
        while (true) {
            show();
            x = nhaptoadox();
            y = nhaptoadoy();
            hienthixy(x,y);
            boolean kt = check();
            if (kt == true) {
                System.out.println("Win");
                break;
            }
            System.out.println("");

        }
    }

    private static void show() {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == x && j == y) {
                    System.out.print(" - ");
                } else if (i == endX && j == endY) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }

    }

    private static int nhaptoadox() {
        int result = 0;
        System.out.print("Nhap vao toa do x: ");
        x = sc.nextInt();
        return result;
    }

    private static int nhaptoadoy() {
        int result = 0;
        System.out.print("Nhap vao toa do y: ");
        y = sc.nextInt();
        return result;
    }

    private static void hienthixy(int x, int y) {
        if (map[x][y] == map[endX][endY]) {
            System.out.println("Win");
        } else if (map[x][y] == 1) {
            System.out.println("vui long nhap lai");
        } else {
            System.out.println("O");
        }
    }

    private static boolean check() {
        if (x == endX && y == endY) {
            return true;
        } else {
            return false;
        }
    }

}
