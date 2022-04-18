/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author ASUS
 */
public class Rectangle extends GeoObj {

    private int panjang;
    private int lebar;

    Rectangle() {

    }

    Rectangle(int panjang, int lebar, String no) {
        this.panjang = panjang;
        this.lebar = lebar;
        nomor = no;
    }

    @Override
    public double getPerimeter() {
        return (2 * (this.lebar + this.panjang));
    }

    @Override
    public double getArea() {
        return (this.lebar * this.panjang);
    }
    
    @Override
    public GeoObj maks(GeoObj A) {
        if(A.getArea() > this.getArea()){
            return A;
        }
        else{
            return this;
        }
    }
    
    @Override
    public String getNomor(){
        return nomor;
    }

}
