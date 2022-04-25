package praktikum9;

public class Segitiga extends GeometricObject {

    private double sisi1, sisi2, sisi3, s;

    Segitiga() {
        super();
        this.sisi1 = 1;
        this.sisi2 = 1;
        this.sisi3 = 1;
    }

    Segitiga(double sisi1, double sisi2, double sisi3, String warna, boolean isi) {
        super(warna, isi);
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        s = (double)1/2 * (this.sisi1 + this.sisi2 + this.sisi3);
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public double getSisi1() {
        return this.sisi1;
    }

    public double getSisi2() {
        return this.sisi2;
    }

    public double getSisi3() {
        return this.sisi3;
    }
    
    @Override
    public double getPerimeter(){
        return (this.sisi1 + this.sisi2 + this.sisi3);
    }
    
    @Override
    public double getArea(){
        return (Math.sqrt(this.s * (this.s - this.sisi1) * (this.s - this.sisi2) * (this.s - this.sisi3)));
    }
    
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + this.sisi1 + " sisi2 = " + this.sisi2 + " sisi3 = " + this.sisi3;
    }

}
