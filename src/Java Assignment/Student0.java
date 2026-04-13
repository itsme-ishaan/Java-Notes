public class Student0 {

    private String name;
    private int age;
    private String program;
    private String rollNumber;
    private int[] marks;

    public Student0(String name, int age, String program, String rollNumber, int[] marks) {
        setName(name);
        setAge(age);
        setProgram(program);
        setRollNumber(rollNumber);
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
        else
            System.out.println("Invalid name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 60)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        if (program != null && !program.isEmpty())
            this.program = program;
        else
            System.out.println("Invalid program");
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        if (rollNumber != null && !rollNumber.isEmpty())
            this.rollNumber = rollNumber;
        else
            System.out.println("Invalid roll number");
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        if (marks != null && marks.length == 5)
            this.marks = marks;
        else
            System.out.println("Marks must contain exactly 5 values");
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

    public void displayProfile() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Roll Number: " + rollNumber);

        System.out.print("Marks: ");
        for (int mark : marks)
            System.out.print(mark + " ");

        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("Grade: " + assignGrade());
    }

    public static void main(String[] args) {

        int[] marks = {85, 78, 92, 74, 88};

        Student0 s1 = new Student0(
                "Ishaan",
                21,
                "MCA",
                "MCA2025_STU_1",
                marks
        );

        s1.displayProfile();
    }
}

