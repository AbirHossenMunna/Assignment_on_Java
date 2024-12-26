public class CountNumber {
    public static void main(String[] args) {
        String string = "I am a SQA Engineer";

        // Initializing counters
        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        // Converting string to lower case for easy comparison
        string = string.toLowerCase();

        // Splitting the string into words based on spaces
        String[] words = string.split("\\s+");
        wordCount = words.length;  // Number of words

        // Iterating over each character of the string
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {  // Checking if character is a letter
                charCount++;  // Counting characters
                if (isVowel(c)) {
                    vowelCount++;  // Counting vowels
                } else {
                    consonantCount++;  // Counting consonants
                }
            }
        }

        // Displaying the output
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
