// https://leetcode.com/problems/add-digits/description/

public class a023 {

    public static void main(String[] args) {
        new a023().run();
    }

    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }

    public void run() {
        int input = 38;
        System.out.println(addDigits(input)); // 2
    }

}
