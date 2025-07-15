
// https://www.acmicpc.net/problem/1267
import java.util.Scanner;

public class a022 {

    public static void main(String[] args) {
        new a022().run();
    }

    public void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = 0, m = 0;

        for (int i = 0; i < n; i++) {
            int t = s.nextInt();
            y += ((t / 30) + 1) * 10;
            m += ((t / 60) + 1) * 15;
        }

        if (y < m)
            System.out.println("Y " + y);
        else if (m < y)
            System.out.println("M " + m);
        else
            System.out.println("Y M " + y);

        s.close();
    }
}
