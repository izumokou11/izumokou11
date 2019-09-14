/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        int dodai;
        dodai = sc.nextInt();
        int a[] = new int[dodai];
        int mang = mang(a);

        System.out.println("tong cac phan tu trong mang là:" + mang);
    }

    static int mang(int[] a) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

            sum = sum + a[i];

        }
        return sum;

    }
    
}
