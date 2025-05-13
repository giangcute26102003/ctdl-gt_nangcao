import java.util.Scanner;
public class isnegative {



        public static boolean isAllNegative(double[] arr, int index) {
            // Điều kiện dừng: hết mảng
            if (index < 0) return true;
            // Nếu có số không âm
            if (arr[index] >= 0) return false;
            // Kiểm tra phần tử trước
            return isAllNegative(arr, index - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = Integer.parseInt(sc.nextLine());

            for (int test = 0; test < t; test++) {
                int n = Integer.parseInt(sc.nextLine());
                double[] arr = new double[n];

                String[] nums = sc.nextLine().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Double.parseDouble(nums[i]);
                }

                if (isAllNegative(arr, n - 1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            sc.close();
        }
    }

