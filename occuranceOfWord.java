import java.util.*;
class occuranceOfWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        int count=0;
        String[]arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            String word = arr[i];
            if(c == word.charAt(0)){
                count++;
            }
        }
        System.out.print(count);

    }
}