// 66. Plus One
// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) { // start from last
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // if no carry
            }
            digits[i] = 0; // if overflow
        }

        int[] output = new int[n + 1];
        output[0] = 1;

        return output;
    }
}