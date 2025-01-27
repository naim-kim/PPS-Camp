//https://www.acmicpc.net/problem/2292

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        if (N == 1) {
            System.out.println(1);
            return;
        }
        long k = 1;
        long total = 1;
        
        // Finding N in 'k' layers
        while (total < N) {
            total += 6 * k;
            k++;
        }
        System.out.println(k);
    }
}