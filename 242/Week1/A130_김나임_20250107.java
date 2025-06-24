//Zero That Out
//https://www.acmicpc.net/problem/10773

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int k = s.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < k; i++) {
            int num = s.nextInt();
            if (num == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(num);
            }
        }
        
        int sum = 0;
        for (int val : stack) {
            sum += val;
        }
        
        System.out.println(sum);
    }
}