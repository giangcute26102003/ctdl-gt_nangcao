import java.util.Scanner;



    public class sum_day3 {

        public static Double sum(int n) {
            if (n == 0) return 0.0;
            return ((double) n / (n + 1)) + sum(n - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int[] arr = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < t; i++) {
                System.out.printf("%.10f\n",sum(arr[i]));
            }

        }
    }


