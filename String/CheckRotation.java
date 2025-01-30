import  java.util.*;
class CheckRotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.print(isRotated(s1,s2)?"Yes":"No");
    }
    // public static boolean isRotated(String a , String b){
    //     if(a.length()!=b.length()){
    //         return false;
    //     }
    //     String concat = a+a;
    //     return concat.contains(b);
    // }
    
    //usingLinkedList
    public static boolean isRotated(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        Queue<Character>q1 = new LinkedList<>();
        Queue<Character>q2 = new LinkedList<>();
        for(char c:a.toCharArray()){
            q1.add(c);
        }
        for(char t:b.toCharArray()){
            q2.add(t);
        }
        for(int i=0;i<a.length();i++){
            char top = q1.remove();
            q1.add(top);
            if(q1.equals(q2)){
                return true;
            }
        }
        return false;

    }
}