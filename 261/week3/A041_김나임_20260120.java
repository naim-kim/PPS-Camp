public class a041 {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;

        for (char c : s.toCharArray()) {
            if (capitalize) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
            capitalize = (c == ' ');
        }

        return result.toString();
    }
}