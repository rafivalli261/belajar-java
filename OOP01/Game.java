public class Game {
    public static void main(String[] args) {
        
        // membuat objek player
        Player petani = new Player();

        // mengisi atribut player
        petani.name = "Xiao";
        petani.speed = 80;
        petani.healthPoin = 0;

        // menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }



    }    
}
