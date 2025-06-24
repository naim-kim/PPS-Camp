//https://www.acmicpc.net/problem/1018
import java.util.Scanner;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Renamed to 's'

        int N = s.nextInt();
        int M = s.nextInt();

        arr = new boolean[N][M];

        // Read board input
        for (int i = 0; i < N; i++) {
            String str = s.next();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;    // W -> true
                } else {
                    arr[i][j] = false;   // B -> false
                }
            }
        }
        
        int rowLimit = N - 7;
        int colLimit = M - 7;
        
        for (int i = 0; i < rowLimit; i++) { 
            for (int j = 0; j < colLimit; j++) {
                calculateCount(i, j);
            }
        }

        System.out.println(min);
    }

    public static void calculateCount(int x, int y) {
        int rowEnd = x + 8;
        int colEnd = y + 8;
        int cntr = 0;

        boolean toggle = arr[x][y];

        for (int i = x; i < rowEnd; i++) {
            for (int j = y; j < colEnd; j++) {
              
              if (arr[i][j] != toggle) { // Expected color for the curr cell
                    cntr++;
                }
                
                toggle = !toggle; // next cell
            }
            
            toggle = !toggle; // next row
        }
        cntr = Math.min(cntr, 64 - cntr);

        min = Math.min(min, cntr);
    }
}