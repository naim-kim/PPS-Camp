import java.util.Scanner;

public class A006_김나임_20260110 {
    public static void main(String[] args) {
        new A006_김나임_20260110().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        System.out.print("Enter first character to count: ");
        char ch1 = sc.nextLine().toLowerCase().charAt(0);

        System.out.print("Enter second character to count: ");
        char ch2 = sc.nextLine().toLowerCase().charAt(0);

        int count1 = 0, count2 = 0;
        for (char c : input.toCharArray()) {
            if (c == ch1)
                count1++;
            if (c == ch2)
                count2++;
        }

        boolean result = count1 == count2;
        System.out.println("Are '" + ch1 + "' and '" + ch2 + "' counts equal? " + result);
    }
}
