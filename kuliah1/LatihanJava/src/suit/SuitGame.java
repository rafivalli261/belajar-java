package suit;

import java.util.Scanner;

public class SuitGame {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);

        boolean cek = true;
        String pemain1, pemain2;
        while (cek) {
            System.out.println("Mulai Permainan !!!");
            System.out.print("Nama Pemain 1 : ");
            pemain1 = ky.nextLine();
            System.out.print("Nama Pemain 2 : ");
            pemain2 = ky.nextLine();
            GarangPong game = new GarangPong(pemain1, pemain2);
            game.undiPemain1();
            game.undiPemain2();
            System.out.println("Attribut Pemain 1 : " + game.getAttPemain1());
            System.out.println("Attribut Pemain 2 : " + game.getAttPemain2());
            if (game.cekMenang() == pemain1) {
                System.out.println("Selamat " + pemain1 + " Kamu Menang!");
            } else if (game.cekMenang() == pemain2) {
                System.out.println("Selamat " + pemain2 + " Kamu Menang");
            } else {
                System.out.println("Pertandingan Seri !!!");
            }

            System.out.println("Ingin bermain lagi? ");
            System.out.println("[1] ya");
            System.out.println("[2] cukup");
            System.out.print(" > ");
            int pilih = ky.nextInt();
            if (pilih == 1) {
                cek = true;
            } else {
                cek = false;
            }

        }

    }
}
/*
Catatan : Setelah selesai satu permainan dan lanjut ke permainan selanjutnya 
terdapat bug pada input nama yang menyebabkan sistem tidak membaca
input1 melainkan langsung menuju input2


*/