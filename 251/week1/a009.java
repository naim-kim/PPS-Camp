
// https://school.programmers.co.kr/learn/courses/30/lessons/12918

import java.util.Scanner;

public class a009 {
    public static void main(String[] args) {
        new a009().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        String s = sc.nextLine();
        boolean result = isValid(s);
        System.out.println(result);
        sc.close();
    }

    // Checks if the string is numeric and has length 4 or 6
    public boolean isValid(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        return s.chars().allMatch(Character::isDigit);
    }
}