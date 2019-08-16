/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class HomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String input;
//        System.out.println("Bai 1");
//        System.out.print("Nhap vao a = ");
//        double a = sc.nextDouble();
//        System.out.println("");
//        System.out.print("Nhap vao b = ");
//        double b = sc.nextDouble();
//        System.out.println("");
//        System.out.println("tong " + (a+b));
//        System.out.println("hieu " + (a-b));
//        System.out.println("thuong " + (a/b));
//        System.out.println("tich " + (a*b));
//        System.out.println("luy thua a^b " + Math.pow(a, b));
//        System.out.println("luy thua b^a " + Math.pow(b,a));
        System.out.println("Bai 2");
        System.out.println("giai phuong trinh ax^2+bx+c=0");
        System.out.println("nhap vao a,b,c");
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();
        double d = b*b - 4*a*c;
        double d1 = Math.sqrt(d);
        System.out.println(d );
        double x = -b / (2*a);
        double x1 = (-b + d1) / (2*a);
        double x2 = (-b - d1) / (2*a);
        if (d < 0 ){
            System.out.println("phuong trinh vo nghiem");
        } else if (d == 0){
            System.out.println("phuong trinh co nghiem kep x = ");
            System.out.println(x);
        } else if (d >0) {
            System.out.println("phuong trinh co 2 nghiem x1 = , x2 = " );
            System.out.println(x1 , x2);
        }
        }
        
        
        
        
    }

}
