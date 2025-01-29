import java.util.*;
class Frequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        int[]frq = new int[256];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     frq[arr[i]]++;
        // }
        // for(int i=0;i<frq.length;i++){
        //     System.out.println(frq[i]+" ");
        // }
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            System.out.print(e.getValue()+" ");
        }
    }
}