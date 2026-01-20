import java.util.Scanner;

public class a030 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int now = sc.nextInt();

        double happy = (now == 0) ? 1.0 : 0.0;
        double sad = (now == 1) ? 1.0 : 0.0;

        double p00 = sc.nextDouble();
        double p01 = sc.nextDouble();
        double p10 = sc.nextDouble();
        double p11 = sc.nextDouble();

        sc.close();

        for (int i = 0; i < N; i++) {
            double nextHappy = happy * p00 + sad * p10;
            double nextSad = happy * p01 + sad * p11;
            happy = nextHappy;
            sad = nextSad;
        }

        System.out.println((int) Math.round(happy * 1000));
        System.out.println((int) Math.round(sad * 1000));
    }
}