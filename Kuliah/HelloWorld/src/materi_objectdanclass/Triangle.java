package materi_objectdanclass;
// @author Rafi

public class Triangle {

    double alas = 1, tinggi = 1, sisi = 1;

    Triangle() {

    }

    Triangle(double als, double tgg, double ss) {
        alas = als;
        tinggi = tgg;
        sisi = ss;

    }

    public double getLuas() {
        return (double) 1 / 2 * alas * tinggi;
    }

    public double getKeliling() {
        return sisi + sisi + sisi;
    }

    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}
