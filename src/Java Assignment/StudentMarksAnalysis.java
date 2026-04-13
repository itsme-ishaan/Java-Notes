import java.util.Scanner;

public class StudentMarksAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        // Input marks
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;

        for (int i = 0; i < 5; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            sum += marks[i];
        }

        double average = sum / 5.0;

        System.out.print("Topper index/indices: ");
        for (int i = 0; i < 5; i++) {
            if (marks[i] == highest) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nHighest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);

        sc.close();
    }
}
