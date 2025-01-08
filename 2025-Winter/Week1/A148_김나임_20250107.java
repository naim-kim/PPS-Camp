//https://www.acmicpc.net/problem/1152
//단어의 개수

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        System.out.println(input.isEmpty() ? 0 : input.split("\\s+").length);
        s.close();
    }
}