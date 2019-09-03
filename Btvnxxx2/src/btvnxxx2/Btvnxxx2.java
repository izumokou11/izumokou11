/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnxxx2;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class Btvnxxx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("bai 6-2");
        System.out.print("nhap vao do dai cua mang A: ");
        int dd = sc.nextInt();
        int[] A = new int[dd];
        int[] B = new int[dd];
        for (int i = 0; i < dd; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < dd; i++) {
            B[i] = A[i];
            if (B[i] % 2 == 1) {
                B[i] = -1;
            }
            System.out.print(B[i] + ", ");
        }
        System.out.println("");
        for (int i = 0; i < dd; i++) {
            if (i > 0 && (A[i] < A[i - 1])) {
                System.out.println("Gia tri lon nhat cua mang la: " + A[i - 1]);
            }
        }
        
    }
}
