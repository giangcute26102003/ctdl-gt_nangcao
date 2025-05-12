import java.util.Scanner;

public class Main {
    public static Long giaithuat(Long n){
        if(n<=1) return 1L;
        return n*giaithuat(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        for (Long i = 0L; i <= n; i++) {
            System.out.println(i+"! = "+giaithuat(i));
        }

    }
}