import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a001 {
    public static void main(String[] args) {
        new a001().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("g= ");
        Set<String> g = new HashSet<>(Arrays.asList(sc.nextLine().split(" ")));

        System.out.print("s= ");
        String[] s = sc.nextLine().split(" ");

        int uniqueMatchCount = countUniqueMatches(s, g);
        System.out.println("output= " + uniqueMatchCount);

    }

    // Counts how many unique values from s appear in g
    private int countUniqueMatches(String[] s, Set<String> g) {
        Set<String> matched = new HashSet<>();
        for (String item : s) {
            if (g.contains(item)) {
                matched.add(item);
            }
        }
        return matched.size();
    }
}