
// https://www.acmicpc.net/problem/5622
import java.util.*;

public class a051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int time = 0;

        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'C')
                time += 3;
            else if (c <= 'F')
                time += 4;
            else if (c <= 'I')
                time += 5;
            else if (c <= 'L')
                time += 6;
            else if (c <= 'O')
                time += 7;
            else if (c <= 'S')
                time += 8;
            else if (c <= 'V')
                time += 9;
            else
                time += 10;
        }

        System.out.println(time);
    }
}