import java.util.Scanner;
public class StudentScoreEvaluator {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = scanner.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = scanner.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int m3 = scanner.nextInt();

        if (m1 >= 0 && m1 <= 100) {
            if (m2 >= 0 && m2 <= 100) {
                if (m3 >= 0 && m3 <= 100) {

                    int total = m1 + m2 + m3;
                    double avg = total / 3.0;

                    char grade;

                    if (avg >= 75) {
                        grade = 'A';
                    } else {
                        if (avg >= 60) {
                            grade = 'B';
                        } else {
                            if (avg >= 50) {
                                grade = 'C';
                            } else {
                                grade = 'F';
                            }
                        }
                    }

                    // Output
                    System.out.println("\n===== RESULT =====");
                    System.out.println("Total   : " + total);
                    System.out.println("Average : " + avg);
                    System.out.println("Grade   : " + grade);
                    System.out.println("==================");

                } else {
                    System.out.println("Invalid marks in Subject 3!");
                }
            } else {
                System.out.println("Invalid marks in Subject 2!");
            }
        } else {
            System.out.println("Invalid marks in Subject 1!");
        }


        scanner.close();
    }
}
