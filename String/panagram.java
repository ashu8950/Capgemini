import java.util.*;
class panagram{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        System.out.print(isPanagram(s)?"yes":"no");
    }
    public static boolean isPanagram(String s){ 
        boolean[] visited = new boolean[26];
        s = s.toLowerCase();
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == ' '){
                continue;
            }
            if(ch >='a' && ch <='z'){
                int idx = ch-'a';
                if(!visited[idx]){
                    visited[idx]=true;
                    count++;
                }
            }
            if(count == 26){
                return true;
            }
            
        }
        return false;

    }
}