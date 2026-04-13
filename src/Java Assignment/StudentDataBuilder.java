class StudentBuilder {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    static class InvalidMarkException extends Exception {
        public InvalidMarkException(String message) {
            super(message);
        }
    }

    static class Student {

        String name;
        int age;
        int[] marks;

        Student(String name, int age, int[] marks)
                throws InvalidAgeException, InvalidMarkException {

            if (age < 17)
                throw new InvalidAgeException("Age must be >= 17");

            for (int m : marks)
                if (m < 0 || m > 100)
                    throw new InvalidMarkException("Marks must be between 0–100");

            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        double calculateAverage() {

            int sum = 0;

            for (int m : marks)
                sum += m;

            return sum / 5.0;
        }

        void generateProfile() {

            System.out.println("Student: " + name);
            System.out.println("Age: " + age);
            System.out.println("Average: " + calculateAverage());
        }
    }

    public static void main(String[] args) {

        try {

            int[] marks = {80, 90, 85, 70, 95};

            Student s = new Student("Harsh", 21, marks);

            s.generateProfile();

        } catch (InvalidAgeException e) {

            System.out.println("Admission Error: " + e.getMessage());

        } catch (InvalidMarkException e) {

            System.out.println("Mark Entry Error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Error occurred");

        } finally {

            System.out.println("Execution completed safely");
        }
    }
}
