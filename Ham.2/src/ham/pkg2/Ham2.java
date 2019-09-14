/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham.pkg2;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class Ham2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen: ");
        int a = sc.nextInt();
        boolean kt = cl(a);
        if (kt == true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    static boolean cl( int a){
        if ( a % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
}
