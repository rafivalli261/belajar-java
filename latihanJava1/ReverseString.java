import java.io.*;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str , nstr = "";
        char ch;
        Scanner ky = new Scanner(System.in);

        System.out.print("Original Word : ");
        str = ky.nextLine();
        ky.close();
        // System.out.println(str); // Example Word

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i); // Extract Each Character
            nstr = ch + nstr; // Add Each Character In Front Of
        }

        System.out.println("Reverse Word : " + nstr);

    }
}
