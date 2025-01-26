import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int h = s.nextInt();
            int w = s.nextInt();
            int n = s.nextInt();

            int floor = n % h;
            if (floor == 0) floor = h;

            int room = (n - 1) / h + 1;

            System.out.printf("%d%02d\n", floor, room);
        }
        s.close();
    }
}