
// https://www.acmicpc.net/problem/17210
import java.util.Scanner;

public class a029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값이 충분히 들어오는지 확인 필요
        if (!sc.hasNextInt())
            return;
        int N = sc.nextInt();

        if (!sc.hasNextInt())
            return;
        int first = sc.nextInt();

        sc.close();

        // 규칙 상 6번째 문부터는 불가능
        if (N >= 6) {
            System.out.println("Love is open door");
            return;
        }

        int state = first;
        for (int i = 1; i < N; i++) {
            state ^= 1; // toggle
            System.out.println(state);
        }
    }
}