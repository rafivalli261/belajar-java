package utspbo;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class SoalEmpat2 {

    public static class mahasiswa {

        private String NIM, NAMA;
        private double IPK;

        mahasiswa() {
        }

        mahasiswa(String NIM, String NAMA, double IPK) {
            this.NIM = NIM;
            this.NAMA = NAMA;
            this.IPK = IPK;
        }

        void setNIM(String NIM) {
            this.NIM = NIM;
        }

        void setNAMA(String NAMA) {
            this.NAMA = NAMA;
        }

        void setIPK(double IPK) {
            this.IPK = IPK;
        }

        String getNIM() {
            return this.NIM;
        }

        String getNAMA() {
            return this.NAMA;
        }

        double getIPK() {
            return this.IPK;
        }

        mahasiswa getSmarter(mahasiswa a) {
            if (this.IPK >= a.IPK) {
                return this;
            } else {
                return a;
            }
        }

        void printMahasiswa() {
            System.out.println(this.NIM);
            System.out.println(this.NAMA);
            System.out.print(this.IPK);
        }

        public static void main(String[] args) {
            String nim, nama;
            double ipk;
            int totalMhs, pilihan;

            Scanner scan = new Scanner(System.in);

            totalMhs = scan.nextInt();

            mahasiswa[] data = new mahasiswa[totalMhs];

            for (int i = 0; i < totalMhs; i++) {
                nim = scan.next();
                nama = scan.next();
                ipk = scan.nextDouble();

                data[i] = new mahasiswa(nim, nama, ipk);
            }

            mahasiswa[] testPintar = new mahasiswa[2];
            mahasiswa terpintar = new mahasiswa();

            do {
                pilihan = scan.nextInt();

                switch (pilihan) {
                    case 1:
                        String nim1,
                         nim2;

                        nim1 = scan.next();
                        nim2 = scan.next();

                        for (int i = 0; i < totalMhs; i++) {
                            if (nim1.equals(data[i].getNIM())) {
                                testPintar[0] = data[i];
                            } else if (nim2.equals(data[i].getNIM())) {
                                testPintar[1] = data[i];
                            }
                        }

                        terpintar = testPintar[0].getSmarter(testPintar[1]);
                        terpintar.printMahasiswa();

                        break;
                    case 2:
                        String nimInput;
                        double newIPK;

                        nimInput = scan.next();
                        newIPK = scan.nextDouble();

                        for (int i = 0; i < totalMhs; i++) {
                            if (nimInput.equals(data[i].getNIM())) {
                                data[i].setIPK(newIPK);
                            }
                        }

                        break;
                    case 3:
                        for (int i = 0; i < totalMhs; i++) {
                            data[i].printMahasiswa();
                        }
                        break;
                    default:
                        break;
                }
            } while (pilihan != 0);

        }

    }

}
