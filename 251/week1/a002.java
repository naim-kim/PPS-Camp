
// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/

import java.util.*;

public class a002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++)
                row.add(j == 0 || j == i ? 1 : triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            triangle.add(row);
        }

        triangle.forEach(r -> System.out.println(r.toString().replaceAll("[\\[\\],]", "")));
    }
}