
// https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.*;

public class a004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int d = sc.nextInt();

        int[] res = Arrays.stream(arr).filter(n -> n % d == 0).sorted().toArray();
        System.out.println(Arrays.toString(res.length == 0 ? new int[] { -1 } : res));
    }
}