package basics.strings;

public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Java Programming  ";


        System.out.println("length: " + str.length());
        System.out.println("Char at 2: " + str.charAt(2));
        System.out.println("Substring (5, 16): " + str.substring(5, 16));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Trim: '" + str.trim() + "'");
    }
}
