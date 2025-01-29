import java.util.*;
class Union{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        int[]arr1 = new int[n];
        Set<Integer>s = new HashSet<>();
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int num:arr){
            s.add(num);
        }
        for(int num:arr1){
            s.add(num);
        }
        System.out.print(s);

    }
}