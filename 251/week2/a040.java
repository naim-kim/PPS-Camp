
// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
import java.util.Scanner;

public class a040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter even-length string: ");
        String s = sc.nextLine();
        sc.close();

        System.out.println("Halves are alike? " + halvesAlike(s));
    }

    private static boolean halvesAlike(String s) {
        int n = s.length(), cnt = 0;
        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i)))
                cnt++;
            if (isVowel(s.charAt(i + n / 2)))
                cnt--;
        }
        return cnt == 0;
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}