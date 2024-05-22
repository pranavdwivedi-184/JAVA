/**
 * InnerPrintMethod
 */
class A {
    void abc() {
        System.out.println("hi");
    }

}

class B {
    void xyz() {
        System.out.println("google");
    }

}

public class PrintMethod {
    static int a = 2;
    static int b = 6;

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        A obj1 = new A();
        B obj2 = new B();

        obj1.abc();
        obj2.xyz();

        System.out.printf("a = %d\n", a);
        System.out.print("JK");

    }

}
