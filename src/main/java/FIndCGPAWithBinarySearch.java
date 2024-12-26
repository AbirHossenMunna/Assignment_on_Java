import java.util.Scanner;

public class FIndCGPAWithBinarySearch {
    public static void main(String[] args) {
        // Sample sorted student data in descending order of CGPA
        Student[] students = {
                new Student("Abir", 3.9),
                new Student("Messi", 3.8),
                new Student("Leo", 3.7),
                new Student("Hossen", 3.6),
                new Student("CR7", 3.5)
        };

        // Take CGPA input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the CGPA to search: ");
        double targetCGPA = scanner.nextDouble();

        // Binary search implementation
        int result = binarySearch(students, targetCGPA);
        if (result != -1) {
            System.out.println("CGPA " + targetCGPA + " found! Student: " + students[result].name);
        } else {
            System.out.println("CGPA " + targetCGPA + " not found in the list.");
        }
    }

    public static int binarySearch(Student[] students, double targetCGPA) {
        int left = 0;
        int right = students.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (students[mid].cgpa == targetCGPA) {
                return mid; // Target CGPA found
            } else if (students[mid].cgpa < targetCGPA) {
                right = mid - 1; // Search in the left half
            } else {
                left = mid + 1; // Search in the right half
            }
        }
        return -1; // CGPA not found
    }
}

