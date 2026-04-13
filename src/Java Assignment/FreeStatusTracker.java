public class FeeStatusTracker {
    public static void main(String[] args) {

        boolean[] feesPaid = new boolean[50];

        feesPaid[0] = true;
        feesPaid[1] = false;
        feesPaid[2] = true;
        feesPaid[3] = true;
        feesPaid[4] = false;
        feesPaid[5] = true;
        feesPaid[6] = false;
        feesPaid[7] = true;
        feesPaid[8] = true;
        feesPaid[9] = false;

        int paid = 0;
        int unpaid = 0;

        for (int i = 0; i < 10; i++) {
            if (feesPaid[i]) {
                paid++;
            } else {
                unpaid++;
            }
        }

        double percentagePaid = (paid / 10.0) * 100;

        System.out.println("Paid students: " + paid);
        System.out.println("Unpaid students: " + unpaid);
        System.out.println("Percentage paid: " + percentagePaid + "%");
    }
}




