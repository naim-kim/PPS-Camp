// https://leetcode.com/problems/day-of-the-year/description/
class a072 {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {
                31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int result = 0;
        for (int i = 0; i < month - 1; i++) {
            result += daysInMonth[i];
        }
        return result + day;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}