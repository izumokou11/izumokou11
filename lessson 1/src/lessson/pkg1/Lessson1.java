/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessson.pkg1;

import java.util.Scanner; // gia tri tiep theo nhap tu ban phim

/**
 *
 * @author shira
 */
public class Lessson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        //double a = 3; // double ( so thuc)
//        char c = 'a'; // char ( ki tu)
//        double d = 3.4;
//        float f = 4.56f; // float ( so thap phan)
//        boolean t = true; // boolean ( true - false)
//        String s = "shira";
//        //
////        System.out.println("hello");
//       
//        // giai phuong trinh ax + b = 0;
//        double a = 7;
//        int b = 3; // int ( so nguyen )
//        double x;
//        x = -b/a;
        //System.out.println(a+","+b);
        //System.out.println(x);
//        Scanner sc = new Scanner(System.in);
//        String input; // string 1 kieu du lieu 1 chuoi ki tu
        //System.out.println("nhap vao : ");
        // a = sc.nextInt(); // Nhap vao so nguyen
//        input = sc.nextLine();
//        boolean q = false;
//        int p = 5;
//        String w = "Azie";
//        String o = "666";
//        //System.out.printf("p = %d va q = %d", p,q); //%d decimal int ( so nguyen), %s string ( cac ki tu), %f float
//        System.out.printf("q = %b",q);
// giai phuong trinh bac nhat ax + b =0;
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Nhap vao : ");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double x;
        x = -b / a;
        System.out.println(x);

    }
}
