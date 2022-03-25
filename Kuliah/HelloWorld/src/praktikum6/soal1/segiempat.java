package praktikum6.soal1;
// @author Rafi

public class segiempat {

    double lebar = 1;
    double panjang = 1;

    // SETTER
    void setLebar(double l) {
        lebar = l;
    }

    void setPanjang(double p) {
        panjang = p;
    }

    // CONSTRUCTOR
    segiempat() {

    }

    segiempat(double l, double p) {
        lebar = l;
        panjang = p;
    }

    // GETTER
    double getLebar() {
        return lebar;
    }

    double getPanjang() {
        return panjang;
    }

    double getLuas() {
        return panjang * lebar;
    }

    double getKeliling() {
        return 2 * (panjang + lebar);
    }
}
