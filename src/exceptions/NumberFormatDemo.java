package exceptions;

public class NumberFormatDemo {
    static void main(String[] args) {

        try {
            String value = "abc";
            int num = Integer.parseInt(value);
        }

        catch (NumberFormatException) {
            System.out.println("Invalid Number Format!");

        }
    }
}
