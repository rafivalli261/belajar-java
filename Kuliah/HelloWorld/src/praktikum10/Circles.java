package praktikum10;

public class Circles extends GeoObj {

    private double jari = 1;

    Circles() {

    }

    Circles(double jari, String no) {
        this.jari = jari;
        nomor = no;
    }

    @Override
    public double getPerimeter() {
        return (2 * phi * jari);
    }

    @Override
    public double getArea() {
        return (phi * jari * jari);
    }

    @Override
    public GeoObj maks(GeoObj A) {
        if (A.getArea() > this.getArea()) {
            return A;
        } else {
            return this;
        }
    }

    @Override
    public String getNomor() {
        return nomor;
    }

}
