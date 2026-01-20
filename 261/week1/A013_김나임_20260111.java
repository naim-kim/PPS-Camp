import java.util.*;

public class a013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int res = 0;
        for (String s : input) {
            res ^= Integer.parseInt(s);
        }

        System.out.println(res);
    }
}