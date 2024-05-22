public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int a = 2;
        int b = 7;
        char oty = 't';

        switch (a) {
            case 2:
                System.out.println("hello jadu");
                break;
            case 't':
                System.out.println("right");
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}
