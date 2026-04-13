import java.util.Scanner;
import java.util.Random;

public class StudentIDCardGenerator {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        if (age >= 17){

            System.out.print("Enter your Name: ");
            String name = scanner.nextLine();


            System.out.print("Enter your Program (must be MCA / BCA / MBA): ");
            String program = scanner.next().toUpperCase();

            Random random = new Random();
            int registrationNumber = random.nextInt(9000);

            if (program.equals("MCA") || program.equals("BCA") || program.equals("MBA")){
                System.out.println("\n===== STUDENT ID CARD =====");
                System.out.println("Name           : " + name);
                System.out.println("Age            : " + age);
                System.out.println("Program        : " + program);
                System.out.println("Registration No: " + registrationNumber);
                System.out.println("===========================");
            }
            else {
                System.out.println("Enter a valid Program name!!");
            }
        }
        else{
            System.out.println("Your Age should be higher than 17 to be eligible for Student ID!!");
        }

        scanner.close();
    }
}