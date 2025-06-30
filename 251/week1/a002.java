
// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/

import java.util.*;

public class a002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRow;

        do {
            System.out.print("Enter number of rows: ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid number");
                sc.next();
            }
            numRow = sc.nextInt();
        } while (numRow <= 0);
        sc.close();

        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRow; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }

        triangle.forEach(row -> {
            row.forEach(num -> System.out.print(num + " "));
            System.out.println();
        });
    }
}