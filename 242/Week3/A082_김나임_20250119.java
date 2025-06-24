import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            StringBuilder result = new StringBuilder();
            List<String[]> members = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String age = s.next();
                String name = s.next();
                members.add(new String[]{age, name});
            }

            members.sort(Comparator.comparingInt(a -> Integer.parseInt(a[0])));

            for (String[] member : members) {
                result.append(member[0]).append(" ").append(member[1]).append("\n");
            }

            System.out.print(result);
        }
    }
}