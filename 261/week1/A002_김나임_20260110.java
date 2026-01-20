import java.util.*;

public class A002_김나임_20260110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }

        for (List<Integer> row : triangle) {
            System.out.println(row.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
