import java.util.*;
class CapitalizeFirstLetter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            if(!word.isEmpty() && !Character.isUpperCase(word.charAt(0))){
                arr[i]= Character.toUpperCase(word.charAt(0))+word.substring(1);
            }
            
        }
        System.out.print(String.join(" ",arr));
    }
}