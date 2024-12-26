public class SortingCGPA {
    public static void main(String[] args) {
        // Sample student data
        Student[] students = {
                new Student("Abir", 3.9),
                new Student("Hossen", 3.5),
                new Student("Munna", 3.7),
                new Student("Leo", 3.8),
                new Student("Messi", 3.6)
        };

        // Sorting students based on CGPA in descending order
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].cgpa < students[j + 1].cgpa) {
                    // Swap students[j] and students[j + 1]
                    Student student = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = student;
                }
            }
        }

        // Display sorted students
        System.out.println("Students sorted by CGPA (highest to lowest):");
        for (Student student : students) {
            System.out.println(student.name + " - " + student.cgpa);
        }
    }
}

class Student {
    String name;
    double cgpa;

    Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
}
