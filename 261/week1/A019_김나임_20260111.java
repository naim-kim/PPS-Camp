import java.util.Scanner;

public class a019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt() * sc.nextInt() * sc.nextInt();

        int[] cnt = new int[10];
        for (char c : String.valueOf(val).toCharArray())
            cnt[c - '0']++;

        for (int c : cnt)
            System.out.println(c);
    }
}