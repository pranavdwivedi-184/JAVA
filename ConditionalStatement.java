public class ConditionalStatement {
    // conditonal and nested conditional statement
    static int a = 2, b = 5, c = 8, d = 2;

    public static void main(String[] args) {
        System.out.println("\033[h\033[2J");
        if (a > b || a > d) {
            if (a > c && a < d) {
                System.out.println("time pass");
            }
            System.out.println("Youtube");
        } else if (a > b) {
            System.out.println("google");
        } else {
            System.out.println("invalid");
        }
    }

}
