//방 번호
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String room = br.readLine();
            System.out.println(calculateMin(room));
        }
    }

    private static int calculateMin(String room) {
        int[] cntr = new int[10];

        for (char c : room.toCharArray()) {
            cntr[c - '0']++;
        }

        cntr[6] = cntr[9] = (cntr[6] + cntr[9] + 1) / 2;
        
        int max = 0;
        for (int num : cntr) {
            max = Math.max(max, num);
        }
        
        return max;
    }
}