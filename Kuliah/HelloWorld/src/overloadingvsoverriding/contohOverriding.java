
package overloadingvsoverriding;


public class contohOverriding {

    public static void main(String args[]) {
        Elektronik elex = new Elektronik();
        elex.cetak(12000);
        elex.cetak(20000);
        
    }
}

class Barang{
    
    public void cetak(int harga){
        System.out.println("Harga Barang : " + harga);
    }
}

class Mainan extends Barang{
    public void cetak(int harga){
        System.out.println("Ini mainan harganya Rp" + harga);
    }
}

class Elektronik extends Mainan{
    public void cetak(int harga){
        System.out.println("Ini barang elektronik yang berharga $" + harga);
    }
}