/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println(" bai 1");
        int pt = 10;
        int tong = 0;
        int[] a = new int[pt];
        for (int i = 0; i < pt; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();

        }

        for (int i = 0; i < pt; i++) {
            tong = tong + a[i];
        }
        System.out.print("tong cac phan tu = ");
        System.out.println(tong);
        System.out.println("---------------------------------");
        System.out.println(" bai 2");
        System.out.print("cac phan tu o vi tri chan la: ");
        for (int i = 0; i < pt; i++) {
            if (i % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("cac phan tu o vi tri le la: ");
        for (int i = 0; i < pt; i++) {
            if (i % 2 == 1) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("cac phan tu chia het cho 2 la:");
        for (int i = 0; i < pt; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("cac phan tu chia cho 5 du 1 la: ");
        for (int i = 0; i < pt; i++) {
            if (a[i] % 5 == 1) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        int tongchan = 0;
        for(int i = 0; i < pt; i++){
            if (a[i] % 2 == 0){
                tongchan = tongchan + a[i];
            }
        } System.out.println("tong cac phan tu chan = " + tongchan);

    }

}
