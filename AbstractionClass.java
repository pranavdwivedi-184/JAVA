abstract class pranav {

    abstract void jk(); // ALL ABSTRACTION METHOD BODY SHOULD BE DEFINED IN EXTENDED CLASS!!

    {
        System.out.println("sy");
    }

    abstract void pd();

    void pr() {
        System.out.println("gy");
    }
}

class vidit extends pranav {

    public void jk() {
        System.out.println("Hello world");

    }

    public void pd() {
        System.out.println("hello1");
    }

    // public void pr() {
    // System.out.println("48 thik hain");
    // }
}

public class AbstractionClass {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        vidit obj = new vidit();
        obj.pr();
        obj.jk();
        obj.pd();
    }
}
