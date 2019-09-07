/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les7;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class Les7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, sx;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang: ");
        System.out.print("Do dai mang A: ");
        int a = sc.nextInt();
        System.out.print("Do dai mang B: ");
        int b = sc.nextInt();
        int[] A = new int[a];
        int[] B = new int[b];
        int c = a + b;
        int[] C = new int[c];
        System.out.println("Nhap vao phan tu mang A: ");
        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Mang A: ");
        for (int i = 0; i < a; i++) {
            System.out.print(A[i] + ", ");
        }
        for (int i = 0; i < a - 1; i++) {
            for (int j = (a - 1); j >= 1; j--) {
                if (A[j] < A[j - 1]) {
                    sx = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = sx;
                }
            }
        }
        System.out.println("");
        System.out.print("Mang A sau khi sap xep: ");
        for (int i = 0; i < a; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println("");
        System.out.println("Nhap vao phan tu mang B: ");
        for (int i = 0; i < b; i++) {
            B[i] = sc.nextInt();
        }
        System.out.print("Mang B: ");
        for (int i = 0; i < b; i++) {
            System.out.print(B[i] + ", ");
        }
        for (int i = 0; i < b - 1; i++) {
            for (int j = (b - 1); j >= 1; j--) {
                if (B[j] < B[j - 1]) {
                    sx = B[j];
                    B[j] = B[j - 1];
                    B[j - 1] = sx;
                }
            }
        }
        System.out.println("");
        System.out.print("Mang B sau sap xep: ");
        for (int i = 0; i < b; i++) {
            System.out.print(B[i] + ", ");
        }
        System.out.println("");
        for ( int i = 0; i < c; i++){
            if(i < a){
                C[i] = A[i];
            } else {
                C[i] = B[i - a];
            }
        }
        System.out.println("");
        System.out.println("Mang C: ");
        for (int i = 0; i < c; i++){
            System.out.print(C[i] + ", ");
        }

    }
}
