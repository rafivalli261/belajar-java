package praktikum10;

public abstract class GeometricObjek {

    private String warna;
    private boolean isi;
    
    GeometricObjek(){
        
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setIsi(boolean isi) {
        this.isi = isi;
    }

    public String getWarna() {
        return this.warna;
    }

    public boolean getIsi() {
        return this.isi;
    }
    
    public abstract double getPerimeter();
    public abstract double getArea();

}
