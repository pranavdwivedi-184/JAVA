public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int x = 10;

        do {
            System.out.println(x + " hello guys");
            x++;
        } while (x > 9);
    }
}
