
// https://www.acmicpc.net/problem/2163
import java.util.Scanner;

public class a031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        sc.close();
        int cuts = N * M - 1;
        System.out.println(cuts);
    }
}