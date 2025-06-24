// 숫자의 개수
// 100
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        
        int result = A * B * C;

        int[] numCtr = new int[10];

        for (char num : Integer.toString(result).toCharArray()) {
            numCtr[num - '0']++;
        }
        for (int count : numCtr) {
            System.out.println(count);
        }

        s.close();
    }
}