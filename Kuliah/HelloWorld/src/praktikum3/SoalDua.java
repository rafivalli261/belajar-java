/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SoalDua {
    public static void main(String[] args) {
        int tahun;
        String bulan;
        Scanner ky = new Scanner(System.in);
        bulan = ky.next();
        tahun = ky.nextInt();
        
        switch(bulan.toLowerCase()){
            case "jan":
                System.out.printf("31 days in January %d", tahun);
                break;
            case "feb":
                 if(tahun % 400 == 0 || tahun % 100 != 0 && tahun % 4 == 0){
                    System.out.printf("29 days in February %d", tahun);
                }
                else{
                    System.out.printf("28 days in February %d", tahun);
                }
                break;
            case "mar":
                System.out.printf("31 days in March %d", tahun);
                break;
            case "apr":
                System.out.printf("30 days in April %d", tahun);
                break;
            case "may":
                System.out.printf("31 days in May %d", tahun);
                break;
            case "jun":
                System.out.printf("30 days in June %d", tahun);
                break;
            case "jul":
                System.out.printf("31 days in July %d", tahun);
                break;
            case "aug":
                System.out.printf("31 days in August %d", tahun);
                break;
            case "sep":
                System.out.printf("30 days in September %d", tahun);
                break;
            case "oct":
                System.out.printf("31 days in October %d", tahun);
                break;
            case "nov":
                System.out.printf("30 days in November %d", tahun);
                break;
            case "dec":
                System.out.printf("31 days in December %d", tahun);
                break;
            default:
                System.out.println("Input Error");
        }
    }
    
}
