package LavendelFinalReharsal;

public class ValidWord {
    static public boolean isValid(String word) {
        int n = word.length();
        word = word.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char ch : word.toCharArray()) {
            if ((!Character.isDigit(ch)) && !Character.isAlphabetic(ch)) {
                return false;
            } else if (Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return (n >= 3) && (vowelCount != 0) && (consonantCount != 0);
    }

    public static void main(String[] args) {
        String str = "234Adas";
        boolean result = isValid(str);
        System.out.println(result);
    }
}
