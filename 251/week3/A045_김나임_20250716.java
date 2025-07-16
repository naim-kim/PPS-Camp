// https://www.acmicpc.net/problem/1157

import java.util.*;

public class a045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'A']++;
        }

        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) (i + 'A');
            } else if (freq[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}