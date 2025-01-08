//통계학
//https://www.acmicpc.net/problem/2108

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] data = new int[n];
        int sum = 0;
        Map<Integer, Integer> ctr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            data[i] = s.nextInt();
            sum += data[i];
            ctr.put(data[i], ctr.getOrDefault(data[i], 0) + 1);
        }

        Arrays.sort(data);

        System.out.println(Math.round((double) sum / n));
        System.out.println(data[n / 2]);

        int max = Collections.max(ctr.values());
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : ctr.entrySet()) {
            if (entry.getValue() == max) {
                modes.add(entry.getKey());
            }
        }
        Collections.sort(modes);
        if (modes.size() == 1) {
            System.out.println(modes.get(0));
        } else {
            System.out.println(modes.get(1));
        }

        System.out.println(data[n - 1] - data[0]);
    }
}
