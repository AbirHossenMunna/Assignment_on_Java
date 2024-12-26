import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String string = "I live in Dhaka";
        string = string.toLowerCase(); // Convert string to lowercase to count case-insensitive characters

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : string.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Display the output
        for (char c : charCount.keySet()) {
            System.out.println(c + " " + charCount.get(c));
        }
    }
}
