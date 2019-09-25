/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamex;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class GameX {

    static int endX, endY;
    static int x, y;
    static final int LENGTH = 5;
    static int map[][];
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        endX = (int) (Math.random() * LENGTH);
        endY = (int) (Math.random() * LENGTH);

        while (true) {
            map();

            x = inputx();
            y = inputy();
            show(x, y);
            boolean kt = check();
            if (kt == true) {
                System.out.println("Win");
                break;
            } else {
                System.out.println("");
            }
        }
    }

    private static void map() {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == x && j == y) {
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

    private static int inputx() {
        int result = 0;
        System.out.print("Nhap vao x: ");
        x = sc.nextInt();
        return result;
    }

    private static int inputy() {
        int result = 0;
        System.out.print("Nhap vao y: ");
        y = sc.nextInt();
        return result;
    }

    static void show(int x, int y) {
        if (map[x][y] == 1) {
            System.out.println("Win");
        } else {
            System.out.println("X");
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
