import java.util.Scanner;

public class a021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int total = 1;

        for (int i = 0; i < k; i++) {
            total += sc.nextInt() - 1;
        }

        System.out.println(total);
        sc.close();
    }
}