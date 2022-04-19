package praktikum10;

public abstract class GeoObj implements Comparable {

    GeoObj() {

    }

    protected String nomor;

    public abstract String getNomor();

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract GeoObj maks(GeoObj A);
}
