//https://www.acmicpc.net/problem/2884
//SPAVANAC

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int M = s.nextInt();

        M -= 45;

        if (M < 0) {
            M += 60;
            H--;
            if (H < 0) {
                H = 23;
            }
        }

        System.out.println(H + " " + M);
    }
}