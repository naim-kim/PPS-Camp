
// https://www.acmicpc.net/problem/2577
import java.util.Scanner;

public class a019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt() * sc.nextInt() * sc.nextInt();
        int[] freq = new int[10];

        for (char c : String.valueOf(result).toCharArray()) {
            freq[c - '0']++;
        }

        for (int f : freq) {
            System.out.println(f);
        }

        sc.close();
    }
}
