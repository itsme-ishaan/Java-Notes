package exceptions;

import java.net.StandardSocketOptions;

public class FinallyDemo {
    static void openFile() {
        System.out.println("Opening File ....");
        }
    static void closeFile() {
        System.out.println("Closing File ....");
    }
    public static void main(String[] args) {
         try{
             openFile();
             int x = 10/0; //error
         }
         catch (Exception e) {
             System.out.println("Something went wrong.");
         }
         finally {
             closeFile();
         }
    }
}
