import java.io.*;
import java.util.*;

public class a017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] cnt = new int[10];
        for (char c : s.toCharArray())
            cnt[c - '0']++;

        cnt[6] = cnt[9] = (cnt[6] + cnt[9] + 1) / 2;

        int max = 0;
        for (int c : cnt)
            max = Math.max(max, c);

        System.out.println(max);
    }
}