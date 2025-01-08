// MODULO 나머지
//https://www.acmicpc.net/problem/3052

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> mod = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            mod.add(s.nextInt() % 42);
        }
        s.close();
        System.out.println(mod.size());
    }
}