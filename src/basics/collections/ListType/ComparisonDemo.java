package basics.collections.ListType;
import java.util.*;

public class ComparisonDemo {

    public static void main(String[] args)

    {
        int N = 200000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < N; i++)
        {
            arrayList.add(i);
            linkedList.add(i);

        }

        long t1 = System.nanoTime();
        arrayList.get(N - 1);

        long t2 = System.nanoTime();


        long t3 = System.nanoTime();
        linkedList.get(N - 1);

        long t4 = System.nanoTime();

        System.out.println("ArrayList get () : ");
        System.out.println("LinkedList get () : ");

    }
}