package suit;
// @uthor Rafi

public class GarangPong {

    private String pemain1, pemain2, attPemain1, attPemain2;

    GarangPong() {
        this.pemain1 = "Nothing";
        this.pemain2 = "Happen";
    }

    GarangPong(String pemain1, String pemain2) {
        this.pemain1 = pemain1;
        this.pemain2 = pemain2;
    }

    public void undiPemain1() {
        int x = (int) (Math.random() * 100);
        if (x >= 0 && x <= 33) {
            this.attPemain1 = "batu";
        } else if (x >= 34 && x <= 66) {
            this.attPemain1 = "kertas";
        } else {
            this.attPemain1 = "gunting";
        }
    }

    public void undiPemain2() {
        int x = (int) (Math.random() * 100);
        if (x >= 0 && x <= 33) {
            this.attPemain2 = "batu";
        } else if (x >= 34 && x <= 66) {
            this.attPemain2 = "kertas";
        } else {
            this.attPemain2 = "gunting";
        }
    }

    public String getAttPemain1() {
        return this.attPemain1;
    }

    public String getAttPemain2() {
        return this.attPemain2;
    }

    public String cekMenang() {
        if (this.attPemain1 == "batu" && this.attPemain2 == "kertas") {
            return this.pemain2;
        } else if (this.attPemain1 == "kertas" && this.attPemain2 == "batu") {
            return this.pemain1;
        } else if (this.attPemain1 == "batu" && this.attPemain2 == "gunting") {
            return this.pemain1;
        } else if (this.attPemain1 == "gunting" && this.attPemain2 == "batu") {
            return this.pemain2;
        } else if (this.attPemain1 == "kertas" && this.attPemain2 == "gunting") {
            return this.pemain2;
        } else if (this.attPemain1 == "gunting" && this.attPemain2 == "kertas") {
            return this.pemain1;
        } else {
            return "draw";
        }

    }

}
