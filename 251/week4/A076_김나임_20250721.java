
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWqU0zh6rssDFARG&categoryId=AWqU0zh6rssDFARG&categoryType=CODE&problemTitle=%EC%A0%95%EB%A0%AC&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
import java.util.*;
import java.io.*;

public class a076 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            Set<String> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(sc.next());
            }

            List<String> names = new ArrayList<>(set);
            names.sort((a, b) -> {
                if (a.length() != b.length())
                    return Integer.compare(a.length(), b.length());
                return a.compareTo(b);
            });

            System.out.println("#" + t);
            names.forEach(System.out::println);
        }
    }
}
