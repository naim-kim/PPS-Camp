import java.util.Scanner;

public class a009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() != 4 && s.length() != 6) {
            System.out.println(false);
            return;
        }

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}