package String;

public class NumOfRepeatingChars {
    static void main(String[] args) {
        String str = "racecar";
        int[] arr = new int[26];

        char[] chars = str.toCharArray();
        for (char ch : chars) {
            int pos = ch - 'a';
            arr[pos] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                char ch = (char) (97 + i);
                System.out.println(ch + " " + " -> " + " " + arr[i]);
            }
        }
    }
}
