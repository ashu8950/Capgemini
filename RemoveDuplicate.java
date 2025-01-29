import java.util.*;
class RemoveDuplicate{
    static void duplicateRemoving(int[] arr){
        if(arr.length == 0 || arr.length == 1 ){
            System.out.print(Arrays.toString(arr));
            return ;
        }
        int j =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i = 0 ; i<j;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //using set

        // Set<Integer>s=new HashSet<>();
        // for(int num:arr){
        //     s.add(num);
        // }
        // System.out.print(s);
        
        //using two pointer

        duplicateRemoving(arr);


        //using hashmap
        // HashMap<Integer,Integer>hm = new HashMap<>();
        // for(int num:arr){
        //     hm.put(num,hm.getOrDefault(num,0)+1);
        // }
        // for(Map.Entry<Integer,Integer>e:hm.entrySet()){
        //     System.out.print(e.getKey()+" ");
        // }

        
    }
}