import java.util.Scanner;

public class MakePatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marks: ");
        int marks = scanner.nextInt();

        // First part: descending pattern
        for (int i = marks; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Second part: ascending pattern
        for (int i = 2; i <= marks; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
