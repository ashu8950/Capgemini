import java.util.*;
class newOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] user = new String[3];
        System.out.println("Enter user names:");
        for(int i = 0; i < 3; i++) {
            user[i] = sc.next();
        }
        System.out.println("Enter subjects:");
        String[] sub = new String[3];
        for(int i = 0; i < 3; i++) {
            sub[i] = sc.next();
        }
        System.out.println("Enter marks:");
        int[][] mark = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Enter mark for " + user[i] + " in subject " + sub[j] + ": ");
                mark[i][j] = sc.nextInt();
            }
        }

        System.out.println("Display output:");
        for(int i = 0; i < 3; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                System.out.println("User: " + user[i] + ", Subject: " + sub[j] + ", Marks: " + mark[i][j]);
                sum += mark[i][j];
            }
            System.out.println("Sum : "+sum);
            int percent = (sum * 100) / 300;
            System.out.println("Percentage: " + percent + "%");
        }
    }
}
