/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class HomeWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("De 1");
        int n;
        System.out.print("Nhap vao 1 so bat ki n = ");
        n = new Scanner(System.in).nextInt();
        int z = 0;
        for (z = 1; z < n; z++) {
            System.out.println("z = " + z);
        }
        int dem = 0;
        for (int j = 1; j < z; j++) {
            if (z % j == 0) {
                System.out.println("j = " + j);
                dem++;
            }
        }
    }
}
