public class A005_김나임_20260110 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] trees = { "BACDE", "CBADF", "AECB", "BDA" };
        int count = 0;

        for (String tree : trees) {
            String filtered = "";

            for (int i = 0; i < tree.length(); i++) {
                char c = tree.charAt(i);
                if (skill.indexOf(c) != -1) {
                    filtered += c;
                }
            }

            if (skill.startsWith(filtered)) {
                count++;
            }
        }

        System.out.println("Valid skill tree count: " + count);
    }
}