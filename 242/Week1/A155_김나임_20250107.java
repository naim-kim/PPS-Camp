//랜선자르기 
//https://www.acmicpc.net/problem/1654

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int k = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);

        int[] len = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            len[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, len[i]);
        }

        long l = 1, r = max, result = 0;

        while (l <= r) {
            long mid = (l + r) / 2, ctr = 0;
            for (int length : len) {
                ctr += length / mid;
            }
            if (ctr >= n) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(result);
    }
}