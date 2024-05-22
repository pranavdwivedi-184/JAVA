
interface a {
    public abstract void jk();

    // each and every class must have body in implements class
    void z();
}

class b implements a {
    public void jk() {
        System.out.println("hello guys");
    }

    public void z() {
        System.out.println("bye guys");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        b obj = new b();
        obj.jk();
        obj.z();
    }
}
