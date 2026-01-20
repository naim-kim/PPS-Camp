import java.util.*;

public class A004_김나임_20260110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int d = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            int n = Integer.parseInt(s);
            if (n % d == 0) {
                list.add(n);
            }
        }

        if (list.isEmpty()) {
            System.out.println(Arrays.toString(new int[] { -1 }));
            return;
        }

        Collections.sort(list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        System.out.println(Arrays.toString(res));
    }
}
