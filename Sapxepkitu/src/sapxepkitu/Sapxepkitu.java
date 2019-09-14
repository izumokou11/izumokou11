/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepkitu;

import java.util.Scanner;

/**
 *
 * @author shira
 */
public class Sapxepkitu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap noi dung cua chuoi: ");
        String s = sc.nextLine();
        char[] A = s.toCharArray();
        char sx = sx(A);
        System.out.println(sx);
    }

    static char sx(char[] A) {
        char sx1 = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    sx1 = A[i];
                    A[i] = A[j];
                    A[j] = sx1;
                }
            }
            System.out.print(A[i] + ", ");
        }
        return sx1;
    }
}
