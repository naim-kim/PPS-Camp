
// 455. Assign Cookies
// https://leetcode.com/problems/assign-cookies/description/

import java.util.Arrays;
import java.util.Scanner;

public class a001 {

    public static void main(String[] args) {
        new a001().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter greed factors (space-separated): ");
        int[] g = parseLineToIntArray(sc.nextLine());

        System.out.print("Enter cookie sizes (space-separated): ");
        int[] s = parseLineToIntArray(sc.nextLine());

        int result = findContentChildren(g, s);
        System.out.println("Max satisfied children: " + result);
    }

    private int[] parseLineToIntArray(String line) {
        return Arrays.stream(line.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }
        return child;
    }
}