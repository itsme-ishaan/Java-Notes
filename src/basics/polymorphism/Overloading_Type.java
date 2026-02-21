package basics.polymorphism;

public class Overloading_Type {

    int sum(int no1) {
        return no1 * 3;
    }

    int sum(int no1, int no2) {
        return no1 + no2;
    }

    double sum(double no1, double no2) {
        return no1 + no2;
    }

    public static void main(String[] args) {

        Overloading_Type ob = new Overloading_Type();

        System.out.println(ob.sum(5, 80));        // int,int
        System.out.println(ob.sum(5.0, 80.0));    // double,double
        System.out.println(ob.sum(5));            // int
    }
}
