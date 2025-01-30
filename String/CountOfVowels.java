import java.util.*;
class CountOfVowels{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){
                continue;
            }
            else if("aeiouAEIOU".contains(ch+"")){
                vowels++;
            }
        }
        System.out.print("vowels:"+vowels);
    }
}