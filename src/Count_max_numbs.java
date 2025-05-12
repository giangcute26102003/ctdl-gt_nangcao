import java.util.ArrayList;
import java.util.Scanner;

public class Count_max_numbs {
    public static int maxDigit(String s, int index) {
        if (index == s.length() - 1) {
            return s.charAt(index) - '0';
        }
        int current = s.charAt(index) - '0';
        int nextMax = maxDigit(s, index + 1);
        return Math.max(current, nextMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> chuoiso = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            chuoiso.add(sc.next());
        }
        for (int i = 0; i < chuoiso.size(); i++) {
            Integer index = 0;
            Integer c = maxDigit(chuoiso.get(i), index);
            String s=  c.toString();
            int count = chuoiso.get(i).length() - chuoiso.get(i).replace(s, "").length();
            System.out.println(chuoiso.get(i) + ": " + count);
        }
    }

}

