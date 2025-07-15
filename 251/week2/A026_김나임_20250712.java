
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
import java.util.Scanner;

public class a026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.println("Is Harshad? " + isHarshad(x));
        sc.close();
    }

    public static boolean isHarshad(int x) {
        int sum = 0, temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return x % sum == 0;
    }
}
