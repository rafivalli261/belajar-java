package utspbo;

import java.util.Scanner;

public class SoalEmpat {

    static class Mahasiswa {

        private String NIM;
        private String nama;
        private double IPK;

        // cons
        
        Mahasiswa(){
            
        }
        
        Mahasiswa(String NIM, String nama, double IPK) {
            this.NIM = NIM;
            this.nama = nama;
            this.IPK = IPK;
        }

        // set
        public void setNIM(String NIM) {
            this.NIM = NIM;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setIPK(double IPK) {
            this.IPK = IPK;
        }

        // get
        public String getNIM() {
            return this.NIM;
        }

        public String getNama() {
            return this.nama;
        }

        public double getIPK() {
            return this.IPK;
        }

        // othr
        public Mahasiswa getSmarter(Mahasiswa A) {
            if (A.IPK > this.IPK) {
                return A;
            } else {
                return this;
            }

        }

        public void cetakIsi() {
            System.out.println(this.NIM);
            System.out.println(this.nama);
            System.out.println(this.IPK);
        }

    }

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        boolean cek = true;
        String nim, nama, nim1, nim2;
        double ipk;
        int masuk;
        int input = ky.nextInt();
        Mahasiswa[] data = new Mahasiswa[input];
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        int gj = 0;

        for (int i = 0; i < input; i++) {
            ky.nextLine();
            nim = ky.nextLine();

            nama = ky.nextLine();

            ipk = ky.nextDouble();
            data[i] = new Mahasiswa(nim, nama, ipk);
        }

        while (cek) {
            masuk = ky.nextInt();
            switch (masuk) {
                case 0:
                    cek = false;
                    break;
                case 1:
                    nim1 = ky.nextLine();
                    nim2 = ky.nextLine();

                    for (int i = 0; i < data.length; i++) {
                        if (data[i].NIM == nim1) {
                            mhs1 = data[i];
                            for (int j = 0; j < data.length; j++) {
                                if (data[j].NIM == nim2) {
                                    mhs2 = data[j].getSmarter(mhs1);
                                    for (int z = 0; z < data.length; z++) {
                                        if (mhs2.NIM == data[z].NIM) {
                                            gj = z;
                                        }
                                    }
                                }
                            }
                        }

                    }

                    break;
                case 2:
                    nim = ky.nextLine();
                    for (int i = 0; i < data.length; i++) {
                        if (data[i].NIM == nim) {
                            ipk = ky.nextDouble();
                            data[i].setIPK(ipk);
                        }
                    }
                    break;
                case 3:
                    data[gj].cetakIsi();
                    for (int i = 0; i < data.length; i++) {
                        data[i].cetakIsi();
                    }
                    break;
            }
        }

    }
}
