import java.util.Scanner;

public class thuattoansinhtohop {



    static int n, k;
    static int[] a;
    static boolean hasNext = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();

        a = new int[k + 1]; // chỉ số từ 1 đến k
        // Khởi tạo tổ hợp đầu tiên
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }

        // Lặp sinh và in
        while (hasNext) {
            print();
            nextCombination();
        }

        scanner.close();
    }

    // In tổ hợp hiện tại
    static void print() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Sinh tổ hợp kế tiếp
    static void nextCombination() {
        int i = k;
        while (i > 0 && a[i] == n - k + i) {
            i--;
        }

        if (i == 0) {
            hasNext = false; // Không còn tổ hợp nào nữa
        } else {
            a[i]++;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
    }
    }
