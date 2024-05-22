public class NumberSwap {
    static int x = 97;
    static int y = 27;

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        // method 1
        /*
         * int z = x;
         * x = y;
         * y = z;
         */

        // method 2
        /*
         * x = x - y;
         * y = x + y;
         * x = y - x;
         */

        // method 3
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
