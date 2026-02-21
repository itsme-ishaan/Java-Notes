package basics.easy;
import java.util.*;

public class Array {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt(); // Pehle size input lo

        // Ab array create karo kyunki ab humein 'size' pata hai
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        scan.close(); // Good practice to close scanner
    }
}