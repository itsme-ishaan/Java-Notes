package basics.collections.ListType;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[]args){

     List<String> names = new ArrayList<>();
     names.add("Ravi");
     names.add("Suman");

     System.out.println("ArrayList: " + names);

     // Fast Random Access
        System.out.println("First Element: " + names.get(0));

     //Iteration
     for (String n : names) {
         System.out.println("Name: " + n);
     }

     // Insert in middle
     names.add("Rahul");
     names.add(1,"Inserted");
     System.out.println("After Insertion: " + names);

    }
}
