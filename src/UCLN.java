import java.util.Scanner;

public class UCLN {
    public static Integer UCLN (int a, int b) {
        if (a == b) return a;
        if (a > b) return UCLN(a - b, b);
        return UCLN(a, b - a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int[][] testCases = new int[n][2];

        for (int i = 0; i < n; i++) {
            testCases[i][0] = sc.nextInt(); // a
            testCases[i][1] = sc.nextInt(); // b
        }
        for (int i = 0; i < n; i++) {
            System.out.println(UCLN(testCases[i][0], testCases[i][1]));
        }

    }
}
