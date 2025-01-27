//https://www.acmicpc.net/problem/2798
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt(); // card num
        int M = s.nextInt();  // sum limit
        int[] cards = new int[N]; // card list
        
        if (N < 3 || N > 100)
          return;
        
        if (M < 10 || M > 300000)
          return;
        
        for (int i = 0; i < N; i++) {
            cards[i] = s.nextInt();
            
            if (cards[i] < 1 || cards[i] >= 100000)
              return;
        }
        
        int maxSum = 0;
        
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    
                    if (sum <= M && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}