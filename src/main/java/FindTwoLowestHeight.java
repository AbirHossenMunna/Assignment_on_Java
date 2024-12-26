import java.util.Scanner;

public class FindTwoLowestHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: height of 10 babies
        System.out.println("Enter the heights of 10 babies in cm:");
        int[] heights = new int[10];

        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
        }

        // Finding the two lowest heights
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] < secondLowest && heights[i] != lowest) {
                secondLowest = heights[i];
            }
        }

        // Output the two lowest heights
        System.out.println("The two lowest heights are: " + lowest + " cm and " + secondLowest + " cm");
    }
}
