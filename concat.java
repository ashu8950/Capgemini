import java.util.*;
class concat{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // StringBuilder sb = new StringBuilder(s1);
        // sb.append(s2);
        // System.out.print(sb.toString());
        int n = s1.length()+ s2.length();
        char[]arr = new char[n];
        int i = 0;
        int j =0;
        int k =0;
        while(i<s1.length()){
            arr[k]=s1.charAt(i);
            i++;
            k++;
        }
        while(j<s2.length()){
            arr[k]=s2.charAt(j);
            j++;
            k++;
        }
        //System.out.print(Arrays.toString(arr));
        System.out.print(new String(arr));

    }
}