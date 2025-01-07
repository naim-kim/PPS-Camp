//나누어 떨어지는 숫자 배열
//https://school.programmers.co.kr/learn/courses/30/lessons/12910?language=java

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int[] result = Arrays.stream(arr) // filter divisibles
                .filter(num -> num % divisor == 0)
                .toArray();

        if (result.length == 0) { // if non are divisible
            return new int[] { -1 };
        }

        Arrays.sort(result); // sort ASC

        return result;
    }
}