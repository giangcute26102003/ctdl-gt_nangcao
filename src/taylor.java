import java.util.Scanner;

public class taylor {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }


    public static double S(Double x, int n) {
        if (n == 1) return x;
        return Math.pow(x, n) / factorial(n) + S(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Double[][] testCases = new Double[n][2];

        for (int i = 0; i < n; i++) {
            testCases[i][0] = sc.nextDouble(); // x
            testCases[i][1] = (Double) sc.nextDouble(); // n
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.8f\n", S(testCases[i][0], testCases[i][1].intValue()));
        }

    }
}
