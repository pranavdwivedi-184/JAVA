
class outer {
    int a = 5;

    class inner {
        int b = 10;
    }

}

public class ConceptOfClass {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        outer obj = new outer();
        outer.inner obj1 = obj.new inner();

        arr obj2 = new arr(); // diffrent class

        System.out.println(obj.a);
        System.out.println(obj1.b);

        System.out.println(obj2.a);
        System.out.println(obj2.pranav());
    }
}
