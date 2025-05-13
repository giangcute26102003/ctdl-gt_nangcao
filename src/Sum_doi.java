import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sum_doi {
    public static double s(int n) {
        if (n == 1) {
            return Math.sqrt(1);
        }

        return Math.sqrt(n + s(n - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.10f", s(arr[i]));
            System.out.println();
        }
    }
}
