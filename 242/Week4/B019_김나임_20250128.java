//https://www.acmicpc.net/problem/10026

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int n;
    static char[][] grid;
    static boolean[][] visited;
    static final int[] dx = {-1, 1, 0, 0}; // array direcions 
    static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt(); // size
        grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = s.next().toCharArray();
        }

        //human view
        visited = new boolean[n][n];
        int humanReg = cntr(false);

        //cow view
        visited = new boolean[n][n]; // Reset visited array
        int cowReg = cntr(true);

        // Output results
        System.out.println(humanReg + " " + cowReg);
    }

    //reg
    private static int cntr(boolean isCow) {
        int reg = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, grid[i][j], isCow);
                    reg++;
                }
            }
        }
        return reg;
    }

    // search and view regoin
    private static void bfs(int x, int y, char color, boolean isCow) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (isValid(nx, ny, color, isCow)) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    // check next cell
    private static boolean isValid(int x, int y, char color, boolean isCow) {
        if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y])
            return false;
            
        // check color
        if (isCow) {
            return (color == 'R' || color == 'G') && (grid[x][y] == 'R' || grid[x][y] == 'G')
                    || color == 'B' && grid[x][y] == 'B';
        } else {
            return grid[x][y] == color;
        }
    }
}