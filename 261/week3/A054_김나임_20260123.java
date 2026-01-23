
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
import java.util.Stack;

class a054 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            int doll = pickTopDoll(board, move - 1);
            if (doll == 0)
                continue;

            if (!basket.isEmpty() && basket.peek() == doll) {
                basket.pop();
                answer += 2;
            } else {
                basket.push(doll);
            }
        }

        return answer;
    }

    private int pickTopDoll(int[][] board, int col) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][col] != 0) {
                int picked = board[row][col];
                board[row][col] = 0;
                return picked;
            }
        }
        return 0;
    }
}