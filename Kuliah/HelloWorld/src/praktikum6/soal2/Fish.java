package praktikum6.soal2;

// @author Rafi
public class Fish {

    String namaIkan;
    String typeOfFish;
    int friendliness;

    Fish() {
        namaIkan = "Ikan Default";
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    Fish(String name, String jenisIkan, int fl) {
        this.namaIkan = name;
        this.typeOfFish = jenisIkan;
        this.friendliness = fl;
    }

    int getFriendliness() {
        return this.friendliness;
    }

    Fish nicestFish(Fish B) {
        if (this.getFriendliness() > B.getFriendliness()) {
            return this;
        } else {
            return B;
        }
    }

}
