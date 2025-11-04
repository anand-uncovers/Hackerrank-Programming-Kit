//Roy wanted to increase his typing speed for programming contests, so he decided to practice with pangrams. A pangram is a sentence that uses every letter of the alphabet at least once.
//        Given a string s, determine whether it is a pangram. Return "pangram" if it is, and "not pangram" if it is not.
//
//        Note: The check must be case-insensitive, and non-alphabetic characters (spaces, numbers, punctuation) should be ignored.
//
//
//        Function Description
//        Complete the function pangrams in the editor below.
//        javapangrams has the following parameter(s):
//        String s: a string to test
//        Returns
//        String: either "pangram" or "not pangram"
//
//        Input Format
//        A single line containing string s.
//
//        Constraints
//
//        0 < length of s ≤ 10³
//        Each character of s is in the ASCII character set.
//
//
//        Sample Input 0
//        textWe promptly judged antique ivory buckles for the next prize
//        Sample Output 0
//        textpangram
//        Explanation 0
//        Contains all 26 letters of the English alphabet.
//
//        Sample Input 1
//        textWe promptly judged antique ivory buckles for the prize
//        Sample Output 1
//        textnot pangram
//        Explanation 1
//        Missing the letter 'x'.
//
//        Sample Input 2
//        textThe quick brown fox jumps over the lazy dog
//        Sample Output 2
//        textpangram


public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        boolean[] seen = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                int idx = c - 'A';
                if (!seen[idx]) {
                    seen[idx] = true;
                    count++;
                }
            } else if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    count++;
                }
            }
        }

        return count == 26 ? "pangram" : "not pangram";
    }
}
