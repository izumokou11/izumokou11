/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class Ham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do dai mang A: ");
        int a = sc.nextInt();
        int[] A = new int[a];
        int tong = tong(A);
        System.out.println("TOng ham la: " + tong);
    }

    static int tong(int[] A) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Nhap cac phan tu cua mang A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            sum = sum + A[i];
        }
        return sum;
    }

}
