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
    static int[][] map = new int[LENGTH][LENGTH];
    static int[][] end = new int[endX][endY];
    static int count = 1;
//    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        endX = (int) (Math.random() * LENGTH);
        endY = (int) (Math.random() * LENGTH);
        while (true) {
            show();
            System.out.println("So lan :" + count);
            x = nhaptoadox();
            y = nhaptoadoy();

            hienthixy(x, y);
            boolean ct = checkT();
            if (ct == true) {
                System.out.println("This guy has no chill");
                for (int i = 0; i < LENGTH; i++) {
                    for (int j = 0; j < LENGTH; j++) {
                        if (map[i][j] == 1) {
                            System.out.print(" X ");
                        } else if (i == endX && j == endY) {
                            System.out.print(" O ");
                        } else {
                            System.out.print(" - ");
                        }
                    }
                    System.out.println();
                }
                break;
            }
            boolean kt = check();
            if (kt == true) {
                System.out.println("Win");
                break;
            }
            System.out.println("");
            count--;

        }
    }

    private static void show() {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (map[i][j] == 1) {
                    System.out.print(" X ");
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

        System.out.print("Nhap vao toa do x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x;
    }

    private static int nhaptoadoy() {

        System.out.print("Nhap vao toa do y: ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        return y;
    }

    private static void hienthixy(int x, int y) {
        if (x == endX && y == endY) {
            System.out.println("Win");
        } else if (map[x][y] == 1) {
            System.out.println("vui long nhap lai");
            count++;
        } else {
            map[x][y] = 1;

        }
    }

    private static boolean check() {
        if (x == endX && y == endY) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkT() {
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

}
