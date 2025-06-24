//지능형 기차

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(calculateMaxPassengers(br));
        }
    }

    private static int calculateMaxPassengers(BufferedReader br) throws IOException {
        int max = 0, cntr = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int off = Integer.parseInt(st.nextToken());
            int on = Integer.parseInt(st.nextToken());

            cntr += on - off;
            max = Math.max(max, cntr);
        }

        return max;
    }
}