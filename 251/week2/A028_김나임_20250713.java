
// https://www.acmicpc.net/problem/10757
import java.math.BigInteger;
import java.util.Scanner;

public class a028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B));
        sc.close();
    }
}
