public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        try {
            int a = 50 / 0;

            System.out.println("print rest of music");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("helli");

        }
    }
}
