import java.util.*;
class Anagram{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        System.out.print(isAnangram(s,s1)? "Anagram":"Not Anagram");
    }
    public static boolean isAnangram(String a , String b){
        if(a.length()!=b.length()){
            return false;
        } ///df
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[]arr = a.toCharArray();
        char[]arr1 = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
       
    }
}