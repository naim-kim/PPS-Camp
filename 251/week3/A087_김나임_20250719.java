
// https://leetcode.com/problems/maximum-units-on-a-truck/
import java.util.*;

public class a087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] boxTypes = new int[n][2];

        for (int i = 0; i < n; i++) {
            boxTypes[i][0] = sc.nextInt();
            boxTypes[i][1] = sc.nextInt();
        }

        int truckSize = sc.nextInt();
        System.out.println(maximumUnits(boxTypes, truckSize));
        sc.close();
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int total = 0;
        for (int[] box : boxTypes) {
            int pick = Math.min(box[0], truckSize);
            total += pick * box[1];
            truckSize -= pick;
            if (truckSize == 0)
                break;
        }

        return total;
    }
}