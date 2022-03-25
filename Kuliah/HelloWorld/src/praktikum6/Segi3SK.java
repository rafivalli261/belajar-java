package praktikum6;

public class Segi3SK {
    double sisiMiring = 1;
    double alas = 1;
    double tinggi = 1;
    
    Segi3SK(){
        
    }
    
    Segi3SK(double al, double tg){
        // sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        alas = al;
        tinggi = tg;
        sisiMiring = Math.sqrt(alas*alas + tinggi*tinggi);
    }
    
    void setAlas(double a){
        alas = a;
    }
    void setTinggi(double a){
        tinggi = a;
    }
    
    double getSisiMiring(){
        return sisiMiring;
    }
    double getAlas(){
        return alas;
    }
    double getTinggi(){
        return tinggi;
    }
    
    double getKeliling(){
        return sisiMiring + alas + tinggi;
    }
    
    double getLuas(){
        return (double)1/2 * alas * tinggi;
    }
    
}
