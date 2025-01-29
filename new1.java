import java.util.*;
class new1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Marks score by Student");
        int marks = sc.nextInt();
        if(marks > 75){
            System.out.println("Result :"+"distinction");
        }
        else if(marks > 40 && marks < 75){
            System.out.println("Result :"+"Pass");
        }
        else{
            System.out.println("Result :"+"fail");
        }
    }
}