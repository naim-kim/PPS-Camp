// 455. Assign Cookies 
// https://leetcode.com/problems/assign-cookies/

import java.util.Arrays;

class Solution {
    public int FCC(int[] g, int[] s) { // FCC==findContentChildren
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j++] >= g[i])
                i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Solution output = new Solution();

        // Ex 1
        int[] g1 = { 1, 2, 3 };
        int[] s1 = { 1, 1 };
        System.out.println(output.FCC(g1, s1));

        // Ex 2
        int[] g2 = { 1, 2 };
        int[] s2 = { 1, 2, 3 };
        System.out.println(output.FCC(g2, s2));
    }
}