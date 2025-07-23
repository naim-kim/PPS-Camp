
// https://school.programmers.co.kr/learn/courses/30/lessons/42746
import java.util.*;

class a075 {
    public String solution(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";

        String[] arr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0"))
            return "0"; // 예: [0, 0, 0]

        return String.join("", arr);
    }
}