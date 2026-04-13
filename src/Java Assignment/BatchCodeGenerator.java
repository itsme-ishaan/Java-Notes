public class BatchCodeGenerator {
    public static void main(String[] args) {

        String prefix = "MCA2025_STU_";
        int totalStudents = 10; // change as needed

        for (int i = 1; i <= totalStudents; i++) {
            String batchCode = prefix + i;
            System.out.println(batchCode);
        }
    }
}
