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
public class SoalEmpat {
    public static void main(String[] args) {
        double input, area;
        Scanner ky = new Scanner(System.in);
        input = ky.nextDouble();
        area = ((6 * input * input) / (4 * Math.tan(Math.PI / 6)));
        System.out.printf("%.2f",area);
        
        
    }
}
