package basics.collections.ListType;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[]args){

        List<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("LinkedList: " + queue);

        // Good: Insertion at Start
        queue.add(0,"Urgent");
        System.out.println("After adding at start: " + queue);

        //Bad: Random Access
        System.out.println("Accessing at index 2: " + queue.get(2));

    }
}
