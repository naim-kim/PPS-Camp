import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String input = s.nextLine();
            List<String> suffixes = new ArrayList<>();

            for (int i = 0; i < input.length(); i++) {
                suffixes.add(input.substring(i));
            }

            Collections.sort(suffixes);

            suffixes.forEach(System.out::println);
        }
    }
}