package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        // Test the lengthOfLastWord method with a sample input
        System.out.println(lengthOfLastWord("Hello World    "));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0; // Variable to store the length of the current word
        int i = 0; // Index to iterate through the string

        // Iterate through the string
        while (i < s.length()) {
            // If the current character is not a space, increment count and move to the next character
            if (s.charAt(i) != ' ') {
                i++;
                count++;
            } else {
                // Skip consecutive spaces
                while (i < s.length() && s.charAt(i) == ' ') i++;

                // If the end of the string is reached after skipping spaces, return the count
                if (i == s.length()) return count;

                // Reset count for the next word
                count = 0;
            }
        }

        // Return the length of the last word
        return count;
    }
}
