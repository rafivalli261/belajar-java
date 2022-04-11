
package overloadingvsoverriding;


public class ContohOverloading {
    public static void main(String[] args) {
        Game gm = new Game();
        gm.tampil("How Do You Train This Dragon?");
        gm.tampil(12.45);
        gm.tampil(("Komi-san"), 5);
    }
}

class Hiburan {
    public void tampil(String ini){
        System.out.println("Ini adalah hiburan " + ini);
    }
}

class Anime extends Hiburan{
    public void tampil(String nama, int angka){
        for(int i = 0; i < angka; i++){
            System.out.println("Anime : " + nama);
        }
    }
}

class Game extends Anime{
    public void tampil(double j){
        System.out.println("Disini masih belum ada game. Error Code : " + j);
    }
}