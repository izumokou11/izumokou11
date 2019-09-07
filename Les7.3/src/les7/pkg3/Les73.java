/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les7.pkg3;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class Les73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, sx;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do dai mang: ");
        n = sc.nextInt();
        int [] A = new int [n];
        System.out.print("Nhap vao phan tu mang: ");
        for ( int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        System.out.print("Mang A: ");
        for ( int i = 0; i < n; i++){
            System.out.println(A[i] + ", ");
        }
        for ( int i = 0; i < n - 1; i++){
            for ( int j = (n - 1); j >= 1; j--){
                if ( A[j] < A[j - 1]){
                    sx = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = sx;
                }
                System.out.println(A[i] + " doi cho cho " + A[j]);
            }
        }
        System.out.println("");
        System.out.print("Mang A sau khi sap xep: ");
        for ( int i = 0; i < n; i++){
            System.out.print(A[i] + ", ");
        }
        
    }
    
}
