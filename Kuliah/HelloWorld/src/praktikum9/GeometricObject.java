package praktikum9;

public class GeometricObject {

    protected String warna;
    protected boolean isi;

    GeometricObject() {
        this.warna = "tidak berwarna";
        this.isi = false;
    }

    GeometricObject(String warna, boolean isi) {
        this.warna = warna;
        this.isi = isi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setIsi(boolean isi) {
        this.isi = isi;
    }

    public String getWarna() {
        return this.warna;
    }

    public boolean getIsi() {
        return this.isi;
    }

    public double getPerimeter(){
        return 3.0;
    }
    public double getArea() {
        return 0.0;
    }
}
