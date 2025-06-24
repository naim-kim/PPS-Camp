//https://www.acmicpc.net/problem/1181

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        if (N < 1 || N > 20000) {
          return;
        }

        scanner.nextLine();
        
        Set<String> wordList = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            if (word.length() > 50) {
              return;
            }
            wordList.add(word);
          
        }
        
        List<String> sortedList = new ArrayList<>(wordList);
        
        sortedList.sort((word1, word2) -> {
            if (word1.length() != word2.length()) {
                return Integer.compare(word1.length(), word2.length());
            } 
            return word1.compareTo(word2);
        });
        
        sortedList.forEach(System.out::println);

        scanner.close();
    }
}