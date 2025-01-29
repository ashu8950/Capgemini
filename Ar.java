import java.util.*;

class Ar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for subjects
        System.out.println("Enter Your Subjects:");
        String[] subjects = new String[3];
        for (int i = 0; i < 3; i++) {
            subjects[i] = sc.next();
        }

        // Take input for marks
        System.out.println("Enter your Marks:");
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }
        double percent =  (sum / 300.0)*100;
        System.out.println("Percent Marks: " + percent);

        System.out.println("Subjects with marks greater than or equal to the Percent:");
        for (int i = 0; i < 3; i++) {
            if (marks[i] >= percent) {
                System.out.println("Subject: " + subjects[i] + " Marks: " + marks[i]);
            }
        }
    }
}
