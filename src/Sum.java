import java.util.Scanner;

public class Sum {
    public static int sum(Integer[] arr, int n) {
        if (n < 0) return 0;
        if (arr[n] % 2 == 0) {
            return arr[n] + sum(arr, n - 1);
        } else {
            return sum(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Integer[] arr = new Integer[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr, t - 1));
    }
}
