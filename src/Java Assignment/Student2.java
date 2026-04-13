public class Student2 {

    private String name;
    private int age;
    private String program;
    private int year;
    private String rollNumber;

    private static int counter = 1;

    private static final String[] VALID_PROGRAMS = {
            "MCA", "BCA", "BTech", "MTech", "MBA"
    };

    public Student2(String name, int age, String program, int year) {

        this.name = name;

        setAge(age);
        setProgram(program);
        setYear(year);

        generateRollNumber();
    }

    private void generateRollNumber() {
        this.rollNumber = "UNI2025_STU_" + counter++;
    }

    public void setAge(int age) {

        if (age >= 17)
            this.age = age;
        else
            System.out.println("Invalid age: must be 17 or above");
    }

    public void setProgram(String program) {

        boolean valid = false;

        for (String p : VALID_PROGRAMS) {
            if (p.equalsIgnoreCase(program)) {
                valid = true;
                break;
            }
        }

        if (valid)
            this.program = program;
        else
            System.out.println("Invalid program");
    }

    public void setYear(int year) {

        if (year >= 1 && year <= 4)
            this.year = year;
        else
            System.out.println("Invalid year: must be between 1 and 4");
    }

    public void displayProfile() {

        System.out.println("----- Admission Record -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Year: " + year);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println();
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2("Ishaan", 22, "MCA", 2);
        Student2 s2 = new Student2("Avinash", 21, "MBA", 1);
        Student2 s3 = new Student2("Vikas", 24, "BCA", 5);
        Student2 s4 = new Student2("Rajneesh", 20, "BTech", 3);

        s1.displayProfile();
        s2.displayProfile();
        s3.displayProfile();
        s4.displayProfile();
    }
}
