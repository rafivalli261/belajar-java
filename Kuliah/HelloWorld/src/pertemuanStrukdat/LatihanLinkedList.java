package pertemuanStrukdat;

import java.util.LinkedList;
import java.util.Scanner;


public class LatihanLinkedList {

    public static void main(String[] args) {
        int x, n;
        Scanner ky = new Scanner(System.in);
        LinkedList<Integer> bil = new LinkedList<>();
        try {
            System.out.print("Masukkan jumlah elemen : ");
            n = ky.nextInt();
            for (int i = 0; i < n; i++) {
                x = ky.nextInt();
                if (x % 2 != 0) {
                    bil.add(x);
                }
            }
            System.out.println(bil);
        } catch (Exception e) {
            System.out.println("\nYang diinputkan bukan int : " + e);
        }
    }
}
