
// https://www.acmicpc.net/problem/10867
import java.util.*;

public class a083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();

        while (n-- > 0) {
            set.add(sc.nextInt());
        }

        for (int num : set) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}