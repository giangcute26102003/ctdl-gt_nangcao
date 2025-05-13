import java.util.Scanner;

public class Sum_doi2 {

    public static double s(int i, int n) {
        if (i > n) {
            return 0;
        }
        return Math.sqrt(i + s(i + 1, n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            System.out.printf("%.10f\n", s(1, arr[i]));
        }
    }
}
