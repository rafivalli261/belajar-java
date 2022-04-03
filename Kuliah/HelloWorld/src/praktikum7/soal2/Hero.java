package praktikum7.soal2;
// @author Rafi

import java.util.Scanner;

class LinearEquation {

    private int a, b, c, d, e, f; 
    private double x = 0, y = 0;
    private Scanner ky = new Scanner(System.in);

    LinearEquation() {
        this.a = ky.nextInt();
        this.b = ky.nextInt();
        this.c = ky.nextInt();
        this.d = ky.nextInt();
        this.e = ky.nextInt();
        this.f = ky.nextInt();
        if (a * d - b * c == 0) {
            System.out.println("Persamaan tidak memiliki solusi");
        } else {
             this.x = (e * d - b * f) / (a * d - b * c);
             this.y = (a * f - e * c) / (a * d - b * c);
        }

    }

    // Getter
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isSolvable() {
        if (a * d - b * c != 0) {
            return true;
        } else {
            return false;
        }
    }

}
public class Hero {

    public static void main(String[] args) {
        LinearEquation obj1 = new LinearEquation();
        System.out.println("x=" + obj1.getX());
        System.out.println("y=" + obj1.getY());
    }
}