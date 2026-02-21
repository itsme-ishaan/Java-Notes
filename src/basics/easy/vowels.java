package basics.easy;
public class vowels {
    public static void main(String[] args) {
        char letter = 'e'; // Fixed: Use single quotes

        // Alphabet check
        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {

            // Fixed: Full comparison for each vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("It is a Vowel");
            } else {
                System.out.println("It is a Consonant");
            }

            // FallThrough Switch inside main method
            switch (Character.toLowerCase(letter)) { // toLowerCase use karne se code chota ho jayega
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Switch: Vowel");
                    break;
                default:
                    System.out.println("Switch: Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }
}