// https://leetcode.com/problems/reverse-linked-list/description/
class a057 {
    public int solution(int[] cookie) {
        int max = 0;
        int n = cookie.length;

        for (int m = 0; m < n - 1; m++) {
            int left = m;
            int right = m + 1;
            int sumLeft = cookie[left];
            int sumRight = cookie[right];

            while (left >= 0 && right < n) {
                if (sumLeft == sumRight) {
                    max = Math.max(max, sumLeft);
                }

                if (sumLeft <= sumRight && left > 0) {
                    sumLeft += cookie[--left];
                } else if (sumRight < sumLeft && right < n - 1) {
                    sumRight += cookie[++right];
                } else {
                    break;
                }
            }
        }
        return max;
    }
}