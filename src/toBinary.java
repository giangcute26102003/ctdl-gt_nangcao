import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class toBinary {

    private static Queue<Integer> toBinaryHelper(int num , Queue<Integer> queue) {
        if (num == 0) {
            if (queue.isEmpty()) queue.add(0); // handle trường hợp đặc biệt: 0
            return queue;
        }
        toBinaryHelper(num / 2, queue); // gọi trước để đảm bảo bit cao nhất vào trước
        queue.add(num % 2); // thêm bit vào queue
        return queue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            Queue<Integer> binary = new LinkedList<Integer>();
            binary = toBinaryHelper(arr[i], binary);
            if(binary.peek() == 0) binary.poll();
            while (!binary.isEmpty()) {
                System.out.print(binary.poll());
            }
            System.out.println();
        }

    }


}
