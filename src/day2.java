import java.util.Scanner;

public class day2 {
    static long[] X = new long[100000];
    static long[] Y = new long[100000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ns = new int[t];

        for (int i = 0; i < t; i++) {
            ns[i] = sc.nextInt();
        }

        X[0] = 1;
        Y[0] = 0;

        for (int i = 0; i < t; i++) {
            int n = ns[i];
            compute(n);
            System.out.println(X[n] + " " + Y[n]);
        }
    }

    static void compute(int n) {
        if (n==0) return;

        compute(n - 1);

        X[n] = X[n - 1] + Y[n - 1];
        Y[n] = 3 * X[n - 1] + Y[n - 1];
    }
}
