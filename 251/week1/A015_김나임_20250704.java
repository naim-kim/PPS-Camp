
// https://school.programmers.co.kr/learn/courses/30/lessons/60057
import java.util.Scanner;

public class a015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        // System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            result += num * num;
        }

        System.out.println(result % 10);
    }
}