
// https://school.programmers.co.kr/learn/courses/30/lessons/42883
import java.util.Scanner;
import java.util.Stack;

public class a027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number string: ");
        String number = sc.next();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Largest number: " + getLargestNumber(number, k));
        sc.close();
    }

    public static String getLargestNumber(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // If k remains
        while (k-- > 0)
            stack.pop();

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
            sb.append(c);

        return sb.toString();
    }
}
