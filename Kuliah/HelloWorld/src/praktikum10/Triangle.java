
package praktikum10;


public class Triangle extends GeometricObjek {
    private int sisi1;
    private int sisi2;
    private int sisi3;
    private double s;
    Triangle(){
    }
    
    Triangle(int sisi1, int sisi2, int sisi3){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.s = 0.5 * (this.sisi1 + this.sisi2 + this.sisi3);
    }
    
    @Override
    public double getPerimeter(){
        return (this.sisi1 + this.sisi2 + this.sisi3);
    }
    
    
    @Override
    public double getArea(){
        return (Math.sqrt(this.s * (this.s - this.sisi1) * (this.s - this.sisi2) * (this.s - this.sisi3)));
    }
    
}
