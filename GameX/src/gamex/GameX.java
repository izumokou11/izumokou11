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

    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;

    static int map[][] = new int[3][3];
    static int currentPlayer = PLAYER1;
    static int x, y;
    static int vuanhap[][];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            hienThi();
            int x1 = nhapToaDoX1();
            int y1 = nhapToaDoY1();
            thayDoiDuLieu1(x1, y1);
            check();
            hienThi();
            int x2 = nhapToaDoX2();
            int y2 = nhapToaDoY2();
            thayDoiDuLieu2(x2, y2);
            check();
        }
    }

    private static void hienThi() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == 0) {
                    System.out.print("-" + " ");
                } else if (map[i][j] == 1) {
                    System.out.print("O" + " ");
                } else if (map[i][j] == 2) {
                    System.out.print("X" + " ");
                }

            }
            System.out.println(" ");
        }
    }

    private static void thayDoiDuLieu1(int x, int y) {
        if (map[x][y] == 2) {
            System.out.println("xin moi nhap lai");
            int x1 = nhapToaDoX1();
            int y1 = nhapToaDoY1();
            thayDoiDuLieu1(x1, y1);
        } else {
            map[x][y] = 1;
        }
    }

    private static int nhapToaDoX1() {
        int result = 0;
        System.out.print("Nhap vao x1:");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        return result;

    }

    private static int nhapToaDoY1() {
        int result = 0;
        System.out.print("Nhap vao y1:");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        return result;
    }

    private static int nhapToaDoX2() {
        int result = 0;
        System.out.print("Nhap vao x2:");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        return result;
    }

    private static int nhapToaDoY2() {
        int result = 0;
        System.out.print("Nhap vao y2:");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        return result;
    }

    private static void thayDoiDuLieu2(int x, int y) {
        if (map[x][y] == 1) {
            System.out.println("Xin moi nhap lai: ");
            int x2 = nhapToaDoX2();
            int y2 = nhapToaDoY2();
            thayDoiDuLieu2(x2, y2);
        } else {
            map[x][y] = 2;
        }
    }

    static void check() {
        for (int i = 0; i < 3; i++) {
            if (map[i][1] == 1 && map[i][2] == 1 && map[i][0] == 1) {
                System.out.println("Player 1 win ");
                break;

            }
            if (map[i][1] == 2 && map[i][2] == 2 && map[i][0] == 2) {
                System.out.println("Player 2 win ");
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (map[1][i] == 1 && map[2][i] == 1 && map[0][i] == 1) {
                System.out.println("Player 1 win ");
                break;

            }
            if (map[1][i] == 2 && map[2][i] == 2 && map[0][i] == 2) {
                System.out.println("Player 2 win ");
                break;

            }
        }
        if (map[0][0] == 1 && map[1][1] == 1 && map[2][2] == 1) {
            System.out.println("Player 1 win");
        }
        if (map[0][0] == 2 && map[1][1] == 2 && map[2][2] == 2) {
            System.out.println("Player 2 win");
        }
        if (map[0][2] == 1 && map[1][1] == 1 && map[2][0] == 1) {
            System.out.println("Player 1 win");
        }
        if (map[0][2] == 2 && map[1][1] == 2 && map[2][0] == 2) {
            System.out.println("Player 2 win");
        }
//        
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                
//            }
//        }

    }
}
