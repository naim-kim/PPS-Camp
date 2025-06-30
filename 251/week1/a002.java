import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a002 {
    public static void main(String[] args) {
        new a002().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        List<List<Integer>> pascalTriangle = generate(numRows);
        printTriangle(pascalTriangle);
    }

    // create pascal < numRows
    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // first || last row is 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(val);
                }
            }

            result.add(row);
        }

        return result;
    }

    // Print Pascal Triancle result in pascalTriangle form
    private void printTriangle(List<List<Integer>> pascalTriangle) {
        for (List<Integer> row : pascalTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}