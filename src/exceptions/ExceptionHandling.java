package exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int x = a / b;

            System.out.println(x);
        }
        catch (ArithmeticException e){
            System.out.println("Error Occured: " + e.getMessage());
        }

        finally {
            System.out.println("Program Continues ...... ");
        }
    }
}