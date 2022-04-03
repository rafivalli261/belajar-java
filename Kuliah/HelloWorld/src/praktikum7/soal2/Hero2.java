/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7.soal2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hero2 {

    static class LinearEquation {

        private int a, b, c, d, e, f;

        LinearEquation() {
        }

        void setA(int a) {
            this.a = a;
        }

        void setB(int b) {
            this.b = b;
        }

        void setC(int c) {
            this.c = c;
        }

        void setD(int d) {
            this.d = d;
        }

        void setE(int e) {
            this.e = e;
        }

        void setF(int f) {
            this.f = f;
        }

        int getA() {
            return this.a;
        }

        int getB() {
            return this.b;
        }

        int getC() {
            return this.c;
        }

        int getD() {
            return this.d;
        }

        int getE() {
            return this.e;
        }

        int getF() {
            return this.f;
        }

        boolean isSolvable() {
            if (this.a * this.d - this.b * this.c != 0) {
                return true;
            }

            return false;
        }

        double getX() {
            return ((this.e) * (this.d)) - ((this.b) * (this.f)) / ((this.a) * (this.d) - (this.b) * (this.c));
        }

        double getY() {
            return ((this.a) * (this.f)) - ((this.e) * (this.c)) / ((this.a) * (this.d) - (this.b) * (this.c));
        }
    }

    public static void main(String[] args) {
        int a, b, c, d, e, f;

        Scanner ky = new Scanner(System.in);
        int[] angka = new int[6];
        for(int i = 0; i < angka.length; i++){
            a = ky.nextInt();
            angka[i] = a;
        }

        LinearEquation obj1 = new LinearEquation();
        obj1.setA(angka[0]);
        obj1.setB(angka[1]);
        obj1.setC(angka[2]);
        obj1.setD(angka[3]);
        obj1.setE(angka[4]);
        obj1.setF(angka[5]);

        if (obj1.isSolvable()) {
            System.out.println("x=" + obj1.getX());
            System.out.println("y=" + obj1.getY());
        } else {
            System.out.print("Persamaan tidak memiliki solusi");
        }
    }
}
