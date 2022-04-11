package overloadingvsoverriding;

public class TestOverloading {

    public static void main(String[] args) {
        D d = new D();
        d.p(10);
        d.p(10.0);
    }
}

class C {

    public void p(double i) {
        System.out.println(i * 2);
    }
}

class D extends C {

    // This method overloads the method in B
    public void p(int i) {
        System.out.println(i);
    }
}
