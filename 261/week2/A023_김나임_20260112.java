public class a023 {

    public static void main(String[] args) {
        System.out.println(new a023().addDigits(38)); // 2
    }

    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}