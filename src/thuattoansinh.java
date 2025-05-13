import java.util.Scanner;
public class thuattoansinh {



        static int n;
        static int[] a;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            a = new int[n];

            generate(0); // Bắt đầu từ vị trí đầu tiên
            scanner.close();
        }


        static void generate(int i) {
            for (int bit = 0; bit <= 1; bit++) {
                a[i] = bit;
                if (i == n - 1) {
                    printArray();
                } else {
                    generate(i + 1);
                }
            }
        }


        static void printArray() {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
