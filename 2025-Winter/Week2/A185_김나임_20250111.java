//https://www.acmicpc.net/problem/1330
//두 수 비교하기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        s.close();
    }
}