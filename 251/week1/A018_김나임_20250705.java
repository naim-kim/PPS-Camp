
// https://www.acmicpc.net/problem/1026
import java.io.*;
import java.util.*;

public class a018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = parseArray(br.readLine(), N);
        int[] B = parseArray(br.readLine(), N);

        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += A[i] * B[N - 1 - i];
        }

        System.out.println(result);
    }

    private static int[] parseArray(String line, int size) {
        return Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}