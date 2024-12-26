import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Remove vowels from the input string
        String result = input.replaceAll("[AEIOUaeiou]", "");

        // Display the result
        System.out.println("Output: " + result);

        scanner.close();
    }
}
