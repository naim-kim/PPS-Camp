//https://www.acmicpc.net/problem/11050

import java.util.Scanner;

public class Main {
  
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    
    public static int ans(int N, int K) {
        return factorial(N) / (factorial(K) * factorial(N - K));
    }
    
    //이항계수구하기
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int K = s.nextInt();
        
        System.out.println(ans(N, K));
        s.close();
    }
}