package basics.strings;

public class StringPoolDemo {

    public static void main(String[] args) {

        String S1 = "Java";
        String S2 = "Java";   // same pool object
        String S3 = new String("Java"); // new object in heap

        System.out.println(S1 == S2);        // true
        System.out.println(S1 == S3);        // false
        System.out.println(S1.equals(S2));   // true
        System.out.println(S1.equals(S3));   // true
    }
}
