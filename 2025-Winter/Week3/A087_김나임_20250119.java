//https://leetcode.com/problems/maximum-units-on-a-truck/

import java.util.Arrays;
import java.util.Scanner;

public class A087_김나임_20250119 {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        // sort boxTypes by num of unit/box in desc
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int total = 0;

        for (int[] box : boxTypes) {
            int numOfBoxes = Math.min(box[0], truckSize);
            total += numOfBoxes * box[1];
            truckSize -= numOfBoxes;

            if (truckSize == 0) {
                break; // full
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] boxTypes = new int[n][2];

        for (int i = 0; i < n; i++) {
            boxTypes[i][0] = s.nextInt(); // boxes
            boxTypes[i][1] = s.nextInt(); // unit/box
        }

        int truckSize = s.nextInt();

        System.out.println(maximumUnits(boxTypes, truckSize));

        s.close();
    }
}