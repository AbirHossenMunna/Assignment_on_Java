import java.util.Scanner;

public class NoteCounter {
    public static void main(String[] args) {
        // Available notes
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Get user input for the amount
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        // Array to store the count of each note
        int[] noteCount = new int[notes.length];

        // Calculate the count of each note
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCount[i] = amount / notes[i]; // Count of the current note
                amount = amount % notes[i]; // Remaining amount
            }
        }

        // Display the result
        System.out.println("Breakdown of the amount:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] != 0) {
                System.out.println(notes[i] + "  " + noteCount[i]);
            }
        }
        scanner.close();
    }
}
