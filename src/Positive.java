import java.util.Scanner;

public class Positive {
    public static int countPositive(Float[] arr, int n) {
        if (n < 0) return 0;
        if (arr[n] > 0) {
            return 1 + countPositive(arr, n - 1);
        } else {
            return countPositive(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Float[] arr = new Float[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextFloat();
        }

        System.out.println(countPositive(arr, t - 1) );
    }
}
