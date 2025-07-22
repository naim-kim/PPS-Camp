
// https://www.acmicpc.net/problem/10814
import java.util.*;

public class a082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String[]> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            members.add(new String[] { sc.next(), sc.next() });
        }

        members.sort(Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        for (String[] m : members) {
            System.out.println(m[0] + " " + m[1]);
        }
        sc.close();
    }
}