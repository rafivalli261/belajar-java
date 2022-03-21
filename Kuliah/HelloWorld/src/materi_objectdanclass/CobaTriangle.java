package materi_objectdanclass;
// @author Rafi

public class CobaTriangle {

    public static void main(String[] args) {
        Triangle segitiga1 = new Triangle();
        Triangle segitiga2 = new Triangle(30, 10, 90);
        Triangle segitiga3 = new Triangle(20, 30, 60);

        System.out.printf("Luas segitiga 1 adalah %.2f, keliling nya adalah %.2f %n", segitiga1.getLuas(), segitiga1.getKeliling());
        System.out.printf("Luas segitiga 2 adalah %.2f, keliling nya adalah %.2f %n", segitiga2.getLuas(), segitiga2.getKeliling());
        System.out.printf("Luas segitiga 3 adalah %.2f, keliling nya adalah %.2f %n", segitiga3.getLuas(), segitiga3.getKeliling());
    }
}
