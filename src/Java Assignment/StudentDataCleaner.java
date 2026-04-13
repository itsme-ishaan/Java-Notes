public class StudentDataCleaner {

    public static String cleanName(String input) {

        input = input.trim();

        input = input.replaceAll("\\s+", " ");

        String[] words = input.split(" ");

        StringBuilder cleanName = new StringBuilder();

        for (String word : words) {

            String formatted =
                    word.substring(0, 1).toUpperCase()
                            + word.substring(1).toLowerCase();

            cleanName.append(formatted).append(" ");
        }

        return cleanName.toString().trim();
    }

    public static void main(String[] args) {

        String messyInput = " HarSH SinGH THakur ";

        String cleaned = cleanName(messyInput);

        String profile = "Student Name: " + cleaned;

        System.out.println("Cleaned Name: " + cleaned);
        System.out.println("Profile String: " + profile);
    }
}
