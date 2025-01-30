import java.util.*;
class FrqOfAlphabet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st=sc.nextLine();
        boolean[]visited = new boolean[256];
        for(int i=0;i<st.length();i++){
            int count=0;
            char ch = st.charAt(i);
            if(ch==' ' || visited[ch]){
                continue;
            }
            for(int j=0;j<st.length();j++){
                if(st.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch+":"+count);
            visited[ch]=true;
        }
    }
}