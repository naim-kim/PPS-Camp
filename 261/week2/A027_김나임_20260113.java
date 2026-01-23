import java.util.Scanner;

public class a027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number string: ");
        String number = sc.next();
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Largest number: " + getLargestNumber(number, k));
        sc.close();
    }

    public static String getLargestNumber(String number, int k) {
        StringBuilder sb = new StringBuilder();

        for (char c : number.toCharArray()) {
            while (sb.length() > 0 && k > 0 && sb.charAt(sb.length() - 1) < c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        return sb.substring(0, sb.length() - k);
    }
}