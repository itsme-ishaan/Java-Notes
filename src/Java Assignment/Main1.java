class Person1 {

    protected String name;
    protected int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayProfile() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String assignGrade() {
        return "No grade";
    }
}


class StudentP extends Person1 {

    protected int[] marks;

    public StudentP(String name, int age, int[] marks) {
        super(name, age);
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0)
            return 0;

        int sum = 0;
        for (int m : marks)
            sum += m;

        return sum / (double) marks.length;
    }

    @Override
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

        System.out.print("Marks: ");
        if (marks != null) {
            for (int m : marks)
                System.out.print(m + " ");
        }

        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("Grade: " + assignGrade());
    }
}


class MeritStudent extends StudentP {

    public MeritStudent(String name, int age, int[] marks) {
        super(name, age, marks);
    }

    @Override
    public String assignGrade() {
        double avg = calculateAverage();

        if (avg >= 85)
            return "Merit Grade A+";
        else
            return super.assignGrade();
    }
}


public class Main1 {

    public static void main(String[] args) {

        Person1 p1 = new StudentP("Ishaan", 22,
                new int[]{80, 70, 90, 85, 75});

        Person1 p2 = new MeritStudent("Priya", 22,
                new int[]{95, 92, 96, 91, 94});

        System.out.println("---- Student 1 ----");
        p1.displayProfile();

        System.out.println("\n---- Student 2 ----");
        p2.displayProfile();
    }
}