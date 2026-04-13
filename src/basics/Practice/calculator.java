package basics.Practice;

/*
 Product Price Calculator (5 Marks)
A retail store requires a Java program that
calculates the Total Price and Average Price of
exactly three predefined products.
This program demonstrates variables, arithmetic
operators, and structured output formatting.
You must write a single complete Java program
following the instructions below exactly.
 */
public class calculator {
    public static void main (String args[]){
        int apple = 60;
        int mango = 80;
        int banana = 20;

        int Total_Price = apple + mango + banana;
        System.out.println(Total_Price);

        float Avg_Price = (Total_Price)/3f;
        System.out.println(Avg_Price);

    }

}
