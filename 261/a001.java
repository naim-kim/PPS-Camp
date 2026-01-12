
// 455. Assign Cookies
// https://leetcode.com/problems/assign-cookies/description/

import java.util.*;

public class a001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] g = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length)
            if (s[cookie++] >= g[child])
                child++;

        System.out.println("Max satisfied children: " + child);
    }
}