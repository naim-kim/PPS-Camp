
// https://www.acmicpc.net/problem/2455
import java.io.*;
import java.util.StringTokenizer;

public class a020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, current = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int off = Integer.parseInt(st.nextToken());
            int on = Integer.parseInt(st.nextToken());

            current += on - off;
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}