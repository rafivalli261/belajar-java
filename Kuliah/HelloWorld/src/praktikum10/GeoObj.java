/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author ASUS
 */
public abstract class GeoObj implements Comparable {
    
    GeoObj(){
        
    }
    
    protected String nomor;
    
    public abstract String getNomor();
    
    public abstract double getPerimeter();

    public abstract double getArea();

    
    public abstract GeoObj maks(GeoObj A);
}
