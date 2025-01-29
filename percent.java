import java.util.*;
class percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your English Marks");
        int eng = sc.nextInt();

        System.out.println("Enter your Hindi Marks");
        int hindi = sc.nextInt();

        System.out.println("Enter your Math Marks");
        int math = sc.nextInt();

        int total = eng + hindi + math;
        
        double percent = (total / 300.0) * 100;

        if (percent >= 75) {
            System.out.println("Distinction");
        } else if (percent >= 40 && percent < 75) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
