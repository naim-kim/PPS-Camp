
// https://school.programmers.co.kr/learn/courses/30/lessons/42747
import java.util.*;

class a078 {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int h = 0; h < n; h++) {
            int cited = n - h;
            if (citations[h] >= cited) {
                return cited;
            }
        }
        return 0;
    }
}