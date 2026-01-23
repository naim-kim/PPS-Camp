import java.io.*;
import java.util.StringTokenizer;

public class a020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cur = 0, max = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cur += Integer.parseInt(st.nextToken());
            cur = cur - Integer.parseInt(st.nextToken());
            max = Math.max(max, cur);
        }

        System.out.println(max);
    }
}