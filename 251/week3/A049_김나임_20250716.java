import java.util.*;

public class a049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String word = sc.nextLine();
            if (word.equals("end"))
                break;

            boolean hasVowel = false, acceptable = true;
            int vowelStreak = 0, consonantStreak = 0;
            char prev = 0;
            String vowels = "aeiou";

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (vowels.indexOf(c) != -1) {
                    hasVowel = true;
                    vowelStreak++;
                    consonantStreak = 0;
                } else {
                    consonantStreak++;
                    vowelStreak = 0;
                }

                if (vowelStreak >= 3 || consonantStreak >= 3) {
                    acceptable = false;
                    break;
                }

                if (i > 0 && c == prev && c != 'e' && c != 'o') {
                    acceptable = false;
                    break;
                }

                prev = c;
            }

            if (hasVowel && acceptable) {
                System.out.println("<" + word + "> is acceptable.");
            } else {
                System.out.println("<" + word + "> is not acceptable.");
            }
        }
    }
}
