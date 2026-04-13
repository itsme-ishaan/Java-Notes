public class Student1 {

    private String name;
    private int age;
    private String program;
    private String rollNumber;
    private int[] marks;

    public Student1(String name, int age, String program, String rollNumber, int[] marks) {
        this.name = name;
        this.age = age;
        this.program = program;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void setMarks(int[] marks) {
        if (marks.length == 5)
            this.marks = marks;
        else
            System.out.println("Marks must contain 5 values");
    }

    public double calculateAverage() {
        int sum = 0;

        for (int mark : marks)
            sum += mark;

        return sum / 5.0;
    }

    public String assignGrade() {

        double avg = calculateAverage();

        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }

    public void printSummaryCard() {

        System.out.println("----- Student Summary Card -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Program: " + program);

        System.out.print("Marks: ");
        for (int mark : marks)
            System.out.print(mark + " ");

        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("Grade: " + assignGrade());
        System.out.println();
    }

    public static void main(String[] args) {

        Student1 s1 = new Student1("Ishaan", 21, "MCA", "MCA2025_STU_1",
                new int[]{80, 75, 90, 85, 70});

        Student1 s2 = new Student1("Elon", 22, "MCA", "MCA2025_STU_2",
                new int[]{65, 70, 60, 72, 68});

        Student1 s3 = new Student1("Priya", 21, "MCA", "MCA2025_STU_3",
                new int[]{92, 88, 95, 90, 94});

        Student1 s4 = new Student1("Avinash", 23, "MCA", "MCA2025_STU_4",
                new int[]{55, 58, 52, 60, 57});

        Student1 s5 = new Student1("Diljeet", 22, "MCA", "MCA2025_STU_5",
                new int[]{45, 50, 48, 42, 46});

        s5.setMarks(new int[]{60, 62, 58, 64, 66});

        s1.printSummaryCard();
        s2.printSummaryCard();
        s3.printSummaryCard();
        s4.printSummaryCard();
        s5.printSummaryCard();
    }
}
