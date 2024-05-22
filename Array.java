
public class Array {

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        // int arr[] = { 2, 57, 8, 19, 65 };

        // for (int j : arr) {
        // System.out.println(j);
        // }

        // multidimension array Sorting
        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter your Array value: ");

        // int pr[][][] = new int[2][2][2];
        // int pr1[] = new int[8];
        // int p = 0;

        // for (int i = 0; i < pr.length; i++) {
        // for (int j = 0; j < pr[0].length; j++) {
        // for (int k = 0; k < pr[0][0].length; k++) {
        // System.out.print("\narr[" + i + "][" + j + "][" + k + "]= ");
        // pr[i][j][k] = sc.nextInt();
        // pr1[p] = pr[i][j][k];
        // p++;
        // }
        // }

        // }
        // System.out.println("\nArrry value are:");
        // for (int i = 0; i < pr.length; i++) {
        // for (int j = 0; j < pr[0].length; j++) {
        // for (int k = 0; k < pr[0][0].length; k++) {
        // System.out.print(pr[i][j][k] + " ");
        // }
        // }
        // System.out.println();
        // }
        // System.out.println("single array value are:");
        // for (int i = 0; i < pr1.length; i++) {
        // System.out.print(pr1[i] + " ");
        // }

        // for (int m = 0; m < pr1.length; m++) {
        // for (int n = 0; n < pr1.length; n++) {
        // if (pr1[m] > pr1[n]) {
        // int z = pr1[m];
        // pr1[m] = pr1[n];
        // pr1[n] = z;

        // }
        // }
        // }
        // System.out.println("\nsorted array:");
        // for (int i = 0; i < pr1.length; i++) {
        // System.out.print(pr1[i] + " ");}

        int arr[][][] = new int[2][3][2];
        arr[0][0][0] = 1;
        System.out.println(arr[0][0].length);
    }

}
