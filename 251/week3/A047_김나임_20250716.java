
// https://www.acmicpc.net/problem/11721
import java.util.*;

public class a047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i += 10) {
            System.out.println(str.substring(i, Math.min(i + 10, str.length())));
        }
    }
}
