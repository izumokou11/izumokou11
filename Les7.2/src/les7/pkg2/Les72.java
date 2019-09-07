/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les7.pkg2;

/**
 *
 * @author shira
 */
public class Les72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sx;
        String sxD;
        String[] HoTen = {
            "To Quang Trung",
            "Hoang Minh Tuan",
            "Nguyen Huu Phuc",
            "Tran An",
            "Tran Truong Giang"
        };
        int[] Diem = {4, 6, 3, 5, 2};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j > 0 && Diem[j] < Diem[j - 1]) {
                    sx = Diem[j];
                    Diem[j] = Diem[j - 1];
                    Diem[j - 1] = sx;
                    sxD = HoTen[j];
                    HoTen[j] = HoTen[j - 1];
                    HoTen[j - 1] = sxD;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(HoTen[i] + " - " + Diem[i]);
        }
    }

}
