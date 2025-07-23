
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
import java.util.*;

class a079 {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] cmd = commands[i];
            int[] temp = Arrays.copyOfRange(array, cmd[0] - 1, cmd[1]);
            Arrays.sort(temp);
            result[i] = temp[cmd[2] - 1];
        }

        return result;
    }
}