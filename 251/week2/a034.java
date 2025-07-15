// https://www.acmicpc.net/problem/3052

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class a034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> mods = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            mods.add(sc.nextInt() % 42);
        }

        sc.close();
        System.out.println(mods.size());
    }
}
