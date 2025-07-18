// https://school.programmers.co.kr/learn/courses/30/lessons/12901
class a062 {
    public String solution(int a, int b) {
        String[] days = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] monthDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int total = 0;
        for (int i = 0; i < a - 1; i++) {
            total += monthDays[i];
        }
        total += b - 1;

        return days[total % 7];
    }
}