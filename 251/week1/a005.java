// https://school.programmers.co.kr/learn/courses/30/lessons/49993

public class a005 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillTrees = { "BACDE", "CBADF", "AECB", "BDA" };
        System.out.println("Valid skill tree count: " + countValid(skill, skillTrees)); // Output: 2
    }

    public static int countValid(String skill, String[] skillTrees) {
        int count = 0;

        for (String tree : skillTrees) {
            StringBuilder filtered = new StringBuilder();

            // Keep only characters that are part of the required skill sequence
            for (char c : tree.toCharArray()) {
                if (skill.indexOf(c) != -1) {
                    filtered.append(c);
                }
            }

            // Check if the filtered string is a valid prefix of the skill order
            if (skill.startsWith(filtered.toString())) {
                count++;
            }
        }

        return count;
    }
}