//https://www.acmicpc.net/problem/1292


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(calculateSum(A, B));
        }
    }

    private static int calculateSum(int A, int B) {
        List<Integer> seq = generateSeq(B);
        return seq.subList(A - 1, B).stream().mapToInt(Integer::intValue).sum();
    }

    private static List<Integer> generateSeq(int limit) {
        List<Integer> seq = new ArrayList<>();
        for (int i = 1; seq.size() < limit; i++) {
            seq.addAll(Collections.nCopies(i, i));
        }
        return seq;
    }
}