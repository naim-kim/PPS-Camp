//보물

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int[] A = readArray(br, N);
            int[] B = readArray(br, N);

            Arrays.sort(A);
            Arrays.sort(B);
            
            int S = calculateMinSum(A, B);
            System.out.println(S);
        }
    }

    private static int[] readArray(BufferedReader br, int N) throws IOException {
        return Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static int calculateMinSum(int[] A, int[] B) {
        int S = 0;
        for (int i = 0; i < A.length; i++) {
            S += A[i] * B[B.length - 1 - i];
        }
        return S;
    }
}
