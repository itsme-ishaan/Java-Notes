package basics.easy;
public class loop {
    public static void main(String[] args) {
        int num = 15;

        // 1. For Loop - 'i' yahan sirf is loop ke andar rahega
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        // 2. While Loop - Yahan humne 'i' ko pehli baar main method mein define kiya
        int i = num;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        // 3. Do-While Loop
        // ERROR FIX: Yahan 'int' mat likhna, sirf 'i' ko reset karo
        i = num;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1); // Make sure yahan semicolon (;) ho
    }
}