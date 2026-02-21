// WAP to assign marks of 3 subject and calculate average and check whether user is pass or fail according to the average.
package basics.easy;
public class marks
{
    public static void main(String[] args)
    {
        int m1 = 34;
        int m2 = 45;
        int m3 = 98;

        int avg = (m1 + m2 + m3)/3;

        if (m1>=33) {
            System.out.println("Pass");
        }
        if (m2>=33) {
            System.out.println("Pass");
        }
        if (m3>=33) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        //______________________________________________________________________
            if (avg >= 40){
                System.out.println("Passed in Average");
            }
            else {
                System.out.println("Failed in Average");
            }
        }
    }
