//https://www.acmicpc.net/problem/9498
//시험성적

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();
        if (input >= 90 && input <= 100) {
            System.out.println("A");
        } else if (input >= 80) {
            System.out.println("B");
        } else if (input >= 70) {
            System.out.println("C");
        } else if (input >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        s.close();
    }
}