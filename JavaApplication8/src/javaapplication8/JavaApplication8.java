/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int [][] matrixA;
//        Scanner sc =new Scanner(System.in);
//        int hang = sc.nextInt();
//        int cot = sc.nextInt();
//        // nhap hang 2 chieu
//        matrixA = new int [hang][cot];
//        for (int i = 0; i < hang ; i++){
//            for ( int j = 0; j < cot; j++){
//                System.out.print("nhap phan tu tai hang " + i + "cot " + j + ": ");
//                matrixA[i][j] = sc.nextInt();
//            }
//        }
//        // in ra ma tran vua nhap
//        int sum = 0;
//        int tongchiahet3 = 0;
//        for (int i = 0; i < hang; i++){
//            System.out.println("");
//            for (int j = 0; j < cot; j++){
//                // in ra cac phan tu
//                System.out.print(matrixA[i][j] + ", ");
//                sum = sum + matrixA[i][j];
//                if (matrixA[i][j] % 3 == 0){
//                    tongchiahet3 = tongchiahet3 + matrixA[i][j];
//                }
//            }
//        }
//        System.out.println("\ntong cac phan tu = " + sum);
//        System.out.println("tong cac phan tu chia het cho 3 = " + tongchiahet3);
//        int D = 0;
//        for (int i = 0; i < cot; i++){
//            int temp = 1;
//            for (int j = 0; j < hang; j++){
//                temp = temp * matrixA[j][j+1];
//            }
//            D += temp; 
//        }
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        matrixA = new int[h1][c1];
        matrixB = new int[h2][c2];
        matrixC = new int [h1][c1];
        for (int i = 0; i < h1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("nhap phan tu tai hang " + i + "cot " + j + ": ");
                matrixA[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h1; i++) {
            System.out.println("");
            for (int j = 0; j < c1; j++) {
                System.out.print(matrixA[i][j] + ", ");
            }

        }
        System.out.println("");

        for (int i = 0; i < h2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("nhap phan tu tai hang: " + i + "cot: " + j + ": ");
                matrixB[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h2; i++) {
            System.out.println("");
            for (int j = 0; j < c2; j++) {
                System.out.print(matrixB[i][j] + ", ");
            }
        }
        System.out.println("tong 2 ma tran: ");
        for (int i = 0; i < h1; i++){
            System.out.println("");
            for (int j = 0; j < c1; j++){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + ", ");
            }
        }

    }
}
