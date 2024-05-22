public class Function {

    static int[] arr = { 10, 56, 78, 90 };

    public static int A(int arr[]) {
        for (int raj : arr) {
            System.out.println(raj);
        }

    }

    public static void main(String[] args) {

        System.out.println("\033[H\033[2J");

        A(arr);
    }

    /*
     * static void A() {
     * B();
     * System.out.println("hello gentleman!");
     * }
     * 
     * static void B() {
     * 
     * System.out.println("whatss up?");
     * }
     * 
     * public static void main(String[] args) {
     * 
     * System.out.println("\033[H\033[2J");
     * A();
     * }
     */

    /*
     * static void A() {
     * System.out.println("hello pranav!");
     * A(); // RESURSSIVE METHOD = METHOD TO CALL ITSELF IS CALLED
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("\033[h\033[2J");
     * A();
     * }
     */

}
