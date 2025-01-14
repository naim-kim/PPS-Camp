//https://www.acmicpc.net/problem/8393
//sum

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println(sum);
        s.close();
    }
}