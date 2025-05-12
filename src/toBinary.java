import java.util.ArrayList;
import java.util.Scanner;

public class toBinary {
    public static ArrayList<Integer> toBinary(int num) {
        ArrayList binary = new ArrayList();
        if (num == 0) return binary;
        if(num % 2 == 0){
            binary.add(0);
            toBinary(num/2);
        }
        else {
            binary.add(1);
            toBinary(num/2);
        }
        return binary;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

        }
        System.out.println(toBinary(100));
    }
}
