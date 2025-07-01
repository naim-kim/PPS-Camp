// https://school.programmers.co.kr/learn/courses/30/lessons/49993

public class a005 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] trees = { "BACDE", "CBADF", "AECB", "BDA" };
        int count = 0;

        for (String tree : trees) {
            String filtered = tree.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .filter(c -> skill.contains(c))
                    .reduce("", String::concat);

            if (skill.startsWith(filtered))
                count++;
        }

        System.out.println("Valid skill tree count: " + count);
    }
}