
// https://www.acmicpc.net/problem/5598
import java.util.*;

public class a050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cipher = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : cipher.toCharArray()) {
            char decrypted = (char) (c - 3);
            if (decrypted < 'A')
                decrypted += 26;
            sb.append(decrypted);
        }

        System.out.println(sb);
    }
}