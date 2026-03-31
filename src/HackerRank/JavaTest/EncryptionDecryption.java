package HackerRank.JavaTest;

import java.io.*;
import java.util.*;

/* 2. Java: Encryption Decryption
Decrypt a message that was encrypted using the following logic:
First the words in the sentence are reversed. For example, "welcome to hackerrank" becomes "hackerrank to welcome".
For each word, adjacent repeated letters are compressed in the format <character> <frequency>. For example, "mississippi" becomes "mis2is2ip2i" or "baaa" becomes "ba3". Note the format is not applied for characters with frequency 1. Also, the frequency will be no greater than 9.

Return the decrypted string.
Example
        encryptedMessage = 'world hel2o'
Expand each word to get 'world hello'. Now reverse the words to get 'hello world', the return value.

Function Description:
Complete the function decrypt in the editor below.
decrypt has the following parameter(s): string encryptedMessage: an encrypted string

Returns
string: the decrypted message

Constraints:
1 ≤ length of encryptedMessage ≤ 105
Character frequency counts in the encrypted string will be 9 or less.
encryptedMessage consists of words and spaces. Words consist of lower case English letters and digits from 0 to 9. */

class Result {

    /*
     * Complete the 'decryptMessage' function below.
     */
    public static String decryptMessage(String encryptedMessage) {
        if (encryptedMessage == null || encryptedMessage.isEmpty()) {
            return encryptedMessage;
        }

        // Using -1 in split preserves trailing spaces, which are effectively
        // "empty words" that must be moved during the reversal.
        String[] words = encryptedMessage.split(" ", -1);
        List<String> decodedWords = new ArrayList<>();

        for (String word : words) {
            StringBuilder decoded = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                // Check if next character is a digit (the frequency)
                if (i + 1 < word.length() && Character.isDigit(word.charAt(i + 1))) {
                    int count = word.charAt(i + 1) - '0';

                    // The frequency 'count' represents the total number of times
                    // the character 'ch' should appear in the result.
                    for (int j = 0; j < count; j++) {
                        decoded.append(ch);
                    }
                    i++; // Skip the digit since we've processed it
                } else {
                    decoded.append(ch);
                }
            }
            decodedWords.add(decoded.toString());
        }

        // Reverse the order of the expanded words
        Collections.reverse(decodedWords);

        // Join the words back together with a single space
        return String.join(" ", decodedWords);
    }
}

public class EncryptionDecryption {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Use standard output if OUTPUT_PATH is not available locally for testing
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath != null ? outputPath : "output.txt"));

        String encryptedMessage = bufferedReader.readLine();

        if (encryptedMessage != null) {
            String result = Result.decryptMessage(encryptedMessage);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
