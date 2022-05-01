package passgen;

public class cobaPassSendiri {

    public static void main(String[] args) {
        /**
         * Membuat program password generator sederhana. Program akan
         * menampilkan kata sandi dengan memakai koleksi array yang telah
         * disediakan Program menampilkan password 8 karakter
         */
        String[] koleksi = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "="};
        // 16 + 26 + 26 +10 = 78
        String[] pw = new String[8];

        for (int i = 0; i < pw.length; i++) {
            pw[i] = koleksi[(int) Math.floor(Math.random() * 100) % 78];
        }
        System.out.print("Your PassWord : ");
        for (int i = 0; i < pw.length; i++) {
            System.out.print(pw[i]);
        }
        System.out.println("");

    }
}
