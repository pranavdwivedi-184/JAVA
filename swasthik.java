import java.util.Scanner;

public class swasthik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side of sasthik:");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (((i > 1) && j < (n / 2)) && ((j < n) && (i > (n / 2)))) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
