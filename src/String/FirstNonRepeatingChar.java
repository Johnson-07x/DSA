package String;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingChar {
    static char firstNonRepeatingElement(String str) {
        List<Character> charList = new ArrayList<>();
        for (char e : str.toCharArray()) {
            if (!charList.contains(e)) {
                charList.add(e);
            } else {
                charList.remove(new Character(e));
            }
        }
        if (charList.isEmpty()) {
            return '$';
        }
        return charList.get(0);
    }

    static void main(String[] args) {
        String str = "racecar";
        System.out.println(firstNonRepeatingElement(str));
    }
}
