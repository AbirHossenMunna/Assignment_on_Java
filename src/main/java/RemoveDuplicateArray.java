import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};

        // Use a HashMap to count occurrences of each number
        HashMap<Integer, Integer> numberCounts = new HashMap<>();
        for (int num : numbers) {
            numberCounts.put(num, numberCounts.getOrDefault(num, 0) + 1);
        }

        // Print numbers with count 1 (unique numbers)
        System.out.println("Unique numbers:");
        for (int num : numberCounts.keySet()) {
            if (numberCounts.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}
