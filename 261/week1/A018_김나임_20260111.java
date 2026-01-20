import java.io.*;
import java.util.*;

public class a018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = parse(br.readLine());
        int[] B = parse(br.readLine());

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += A[i] * B[N - 1 - i];

        System.out.println(sum);
    }

    static int[] parse(String s) {
        String[] arr = s.split(" ");
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            r[i] = Integer.parseInt(arr[i]);
        return r;
    }
}