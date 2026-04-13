package basics.Practice;
import java.util.*;
import java.util.Scanner;
public class input {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("itemName");
        String itemName=sc.nextLine();
        System.out.println("cateogry :1.electronics ,2.grocery");
        int cateogry=sc.nextInt();
        System.out.println("price : " );
        double price = sc.nextDouble();
        String inventoryItem;

        if(category == 1) {
            System.out.println("Electronics");
        } else if (category == 2) {
            System.out.println("Grocery");
        }
        else {
            System.out.println("Invalid Choice");
        }

    }

}
