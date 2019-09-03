/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnxxx;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class Btvnxxx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int h1 = sc.nextInt();
        int c2 = sc.nextInt();
        int h2 = sc.nextInt();
        int[][] A = new int[h1][c1];
        int[][] B = new int[h2][c2];
        int[][] C = new int[h1][c2];
//        for (int i = 0; i < h1; i++) {
//            for (int j = 0; j < c1; j++) {
//                System.out.print("nhap phan tu tai hang: " + i + "cot " + j + ": ");
//                A[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < h1; i++) {
//            System.out.println("");
//            for (int j = 0; j < c1; j++) {
//                System.out.print(A[i][j] + ", ");
//            }
//        }
//        System.out.println("");
//        for ( int i = 0; i < h2; i++){
//            for (int j = 0; j < c2; j++){
//                System.out.print("nhap phan tu tai hang: " + i + "cot " + j + ": ");
//                B[i][j] = sc.nextInt();
//            }
//        }
//        for ( int i = 0; i < h2; i++){
//            System.out.println("");
//            for (int j = 0; j < c2; j++){
//                System.out.print(B[i][j] + ", ");
//            }
//        }
        if (c1 != h2) {
            System.out.println("khong nhan duoc");
        } else {
            for (int i = 0; i < h1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("nhap phan tu tai hang: " + i + "cot " + j + ": ");
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < h1; i++) {
                System.out.println("");
                for (int j = 0; j < c1; j++) {
                    System.out.print(A[i][j] + ", ");
                }
            }
            System.out.println("");
            for (int i = 0; i < h2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("nhap phan tu tai hang: " + i + "cot " + j + ": ");
                    B[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < h2; i++) {
                System.out.println("");
                for (int j = 0; j < c2; j++) {
                    System.out.print(B[i][j] + ", ");
                }
            }
            System.out.println("ma tran tich C: ");
            for (int i = 0; i < c1; i++) {
                for (int j = 0; j < h2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < h2; k++) {
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                }
            }

            for (int i = 0; i < c1; i++) {
                System.out.println("");
                for (int j = 0; j < h2; j++) {
                    System.out.print(C[i][j] + ", ");
                }
            }
        }
    }
}
