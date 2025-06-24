
//https://www.acmicpc.net/problem/8958
//Score
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.nextLine();

        for (int i = 0; i < num; i++) {
            String cases = s.nextLine();

            int score = 0;
            int Os = 0;

            for (char c : cases.toCharArray()) {
                if (c == 'O') {
                    Os++;
                    score += Os;
                } else {
                    Os = 0;
                }
            }
            System.out.println(score);
        }
        s.close();
    }
}