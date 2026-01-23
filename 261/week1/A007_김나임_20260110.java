import java.util.Scanner;

public class A007_김나임_20260110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];

        for (int i = 0; i < 8; i++) {
            a[i] = sc.nextInt();
        }

        boolean asc = true, desc = true;

        for (int i = 1; i < 8; i++) {
            if (a[i] > a[i - 1])
                desc = false;
            if (a[i] < a[i - 1])
                asc = false;
        }

        if (asc)
            System.out.println("ascending");
        else if (desc)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}