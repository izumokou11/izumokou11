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
        char [] B = sapxep(A);
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + ", ");
        }
    }

    static char [] sapxep(char[] A) {
        char temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }
}
