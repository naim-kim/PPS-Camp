import java.util.Scanner;

public class a010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int answer = s.length();

        for (int unit = 1; unit <= s.length() / 2; unit++) {
            String prev = s.substring(0, unit);
            int count = 1;
            String result = "";

            for (int i = unit; i <= s.length(); i += unit) {
                String cur = i + unit <= s.length()
                        ? s.substring(i, i + unit)
                        : "";

                if (prev.equals(cur)) {
                    count++;
                } else {
                    result += (count > 1 ? count : "") + prev;
                    prev = cur;
                    count = 1;
                }
            }

            result += prev;
            answer = Math.min(answer, result.length());
        }

        System.out.println(answer);
    }
}