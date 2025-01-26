import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int M = s.nextInt();
            s.nextLine();

            String[] pokemonsByNum = new String[N + 1];
            Map<String, Integer> pokemonsByName = new HashMap<>();

            for (int i = 1; i <= N; i++) {
                String pokemonName = s.nextLine();
                pokemonsByNum[i] = pokemonName;
                pokemonsByName.put(pokemonName, i);
            }

            processQueries(s, M, pokemonsByNum, pokemonsByName);
        }
    }

    private static void processQueries(Scanner s, int M, String[] pokemonsByNum, Map<String, Integer> pokemonsByName) {
        while (M-- > 0) {
            String query = s.nextLine();
            if (query.chars().allMatch(Character::isDigit)) {
                System.out.println(pokemonsByNum[Integer.parseInt(query)]);
            } else {
                System.out.println(pokemonsByName.get(query));
            }
        }
    }
}