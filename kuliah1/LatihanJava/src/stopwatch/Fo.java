
package stopwatch;

/**
 *
 * @author ASUS
 */
public class Fo {
    private Object contents;
    protected Object getContents(){
        return contents;
    }
    protected void setContents(Object contents){
        this.contents = contents;
    }
    public void showPresent(){
        System.out.println("Your gift : " + contents);
    }
    
    
    public static void main(String[] args) {
        Fo f = new Fo();
        f.setContents(f);
        f.showPresent();
        String title = "Weather";
        //int hot, double cold;
        //System.out.println(hot + " " + title);
        //        int Integer = 0;
        float f2 = 5.0;
    }
}
