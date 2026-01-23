import java.util.Scanner;

public class a029 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int state = sc.nextInt();
        sc.close();

        if (N >= 6) {
            System.out.println("Love is open door");
            return;
        }

        for (int i = 1; i < N; i++) {
            state ^= 1;
            System.out.println(state);
        }
    }
}