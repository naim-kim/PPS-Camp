// https://www.acmicpc.net/problem/5585

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int price = Integer.parseInt(br.readLine());
            System.out.println(calculateChange(1000 - price));
        }
    }

    private static int calculateChange(int change) {
        int[] coins = {500, 100, 50, 10, 5, 1};
        int cntr = 0;
        
        for (int coin : coins) {
            cntr += change / coin;
            change %= coin;
        }
        
        return cntr;
    }
}