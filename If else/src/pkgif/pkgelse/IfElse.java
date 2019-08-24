/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        // toan tu so sanh: int float char byte long...
        // > < >= <== == != cac bieu thuc so sanh
        // k = ( ( condition) ? (true value) : (false value));

        //        int n = 5;
        //        String k;
        //        k = (n > 0) ? ("n lon hon 0") : (" n nho hon 0");
        //        System.out.println(k);
        //        for (int i = 0; i < 10; i++){
        //            System.out.println(i);
        //            System.out.println("cddd" +i);
        //        }
        // && va trong so sanh
        // || hoac trong so sanh
        //        int condition = 0;
        //        while (true) {
        //            System.out.println("ok");
        //            condition = new Scanner(System.in).nextInt();
        //            if (condition == 10) {
        //                break; // for while do-while switch-case
        //            } else {
        //                System.out.println("so vua nhap khong phai 10");
        //            }
        //        }
        //        for (int j = 0; j < 10; j++) {
        //            if (j == 3 || j == 7) {
        //                continue;
        //            }
        //            System.out.println("j = " + j);
        //        }
//        System.out.println("nhap vao "); // dau vao so bat ki - dau ra so chia het cho 2
//        int z = new Scanner(System.in).nextInt();
//        for (int j = 1; j < z; j++) {
//            if (j % 2 == 0) {
//                System.out.println(j);
//            }
//        }
        int dem = 0;
        System.out.print("nhap vao 1 so z = ");
        int z = new Scanner(System.in).nextInt(); // z la so nhap vao
        for (int j = 1; j <= z; j++) {
            if (z % j == 0) {
                System.out.println("Uoc cua so la = " + j); // input so bat ki - output thuong cua so vua nhap
                dem++;
            }

        }
        System.out.println(dem);
        if (dem > 2) {
            System.out.println("z khong phai la so nguyen to");
        } else if (dem == 1) {

            System.out.println("z khong la so nguyen to");
        } else {
            System.out.println(" z la so nguyen to");

        }

    }
}