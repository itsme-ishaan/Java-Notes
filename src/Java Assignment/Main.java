class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class InheritedStudent extends Person {

    protected String program;
    protected String roll;
    protected int[] marks;

    public InheritedStudent(String name, int age, String program, String roll, int[] marks) {
        super(name, age);
        this.program = program;
        this.roll = roll;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;

        for (int m : marks)
            sum += m;

        return sum / (double) marks.length;
    }

    public String assignGrade() {

        double avg = calculateAverage();

        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }

    @Override
    public void displayProfile() {

        super.displayProfile();

        System.out.println("Program: " + program);
        System.out.println("Roll: " + roll);

        System.out.print("Marks: ");
        for (int m : marks)
            System.out.print(m + " ");

        System.out.println("\nGrade: " + assignGrade());
    }
}


class ScholarStudent extends InheritedStudent {

    private double scholarshipAmount;

    public ScholarStudent(String name, int age, String program,
                          String roll, int[] marks, double scholarshipAmount) {

        super(name, age, program, roll, marks);
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public String assignGrade() {

        double avg = calculateAverage();

        if (avg >= 85)
            return "Scholar Grade A+";
        else
            return super.assignGrade();
    }

    @Override
    public void displayProfile() {

        super.displayProfile();

        System.out.println("Scholarship Amount: ₹" + scholarshipAmount);
    }
}


public class Main {

    public static void main(String[] args) {

        InheritedStudent s1 = new InheritedStudent(
                "Ishaan",
                22,
                "MCA",
                "MCA2025_STU_1",
                new int[]{80, 75, 90, 85, 70}
        );

        ScholarStudent s2 = new ScholarStudent(
                "Avinash",
                22,
                "MCA",
                "MCA2025_STU_2",
                new int[]{92, 95, 88, 91, 94},
                50000
        );

        System.out.println("---- Student Profile ----");
        s1.displayProfile();

        System.out.println("\n---- Scholar Student Profile ----");
        s2.displayProfile();
    }
}