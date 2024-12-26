import java.util.Random;

public class GenerateRandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Generate random integers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generate random numbers between 0 and 99
        }

        // Print all numbers
        System.out.println("Generated Random Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the max and min numbers
        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int num : numbers) {
            if (num > maximum) {
                maximum = num;
            }
            if (num < minimum) {
                minimum = num;
            }
        }

        // Print max and min numbers
        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum number: " + minimum);
    }
}
