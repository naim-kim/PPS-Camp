
// https://www.acmicpc.net/problem/1475

import java.io.*;
import java.util.Arrays;

public class a017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String room = br.readLine();
        System.out.println(minSetCount(room));
    }

    private static int minSetCount(String room) {
        int[] count = new int[10];
        for (char c : room.toCharArray()) {
            count[c - '0']++;
        }
        count[6] = count[9] = (count[6] + count[9] + 1) / 2;
        return Arrays.stream(count).max().getAsInt();
    }
}