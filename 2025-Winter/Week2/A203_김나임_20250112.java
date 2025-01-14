//https://www.acmicpc.net/problem/2743
//단어길이재기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        int counter = input.replaceAll("[^a-zA-Z]", "").length();
        System.out.println(counter);

        s.close();
    }
}