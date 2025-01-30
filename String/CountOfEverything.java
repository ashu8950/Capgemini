import java.util.*;
class CountOfEverything {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int capital = 0;
        int lower =0;
        int digit =0;
        int special = 0;
        for(int i=0;i<st.length();i++){
            int count =0;
            char c = st.charAt(i);
            if(c == ' '){
                continue;
            }
            else if(c>='A' && c<='Z'){
                capital++;
            }
            else if(c>='a' && c<='z'){
                lower++;
            }
            else if(c>='0' && c<='9'){
                digit++;
            }
            else{
                special++;
            }

        }
        System.out.println("Capital : "+ capital);
        System.out.println("lower : "+ lower);
        System.out.println("digit : "+ digit);
        System.out.println("speacial : "+ special);

    }
}