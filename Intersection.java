import java.util.*;
class Intersection{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        int[]arr1=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        List<Integer>newLine = new ArrayList<>();
        // List<Integer>l = new ArrayList<>();
        // for(int num:arr){
        //     l.add(num);
        // }
        // List<Integer>ans=new ArrayList<>();
        // for(int t:arr1){
        //     if(l.contains(t)){
        //         ans.add(t);
        //         l.remove(t);
        //     }
        // }
        // for(int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i)+" ");
        // }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr1[j]){
                    newLine.add(arr1[j]);
                    arr1[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        System.out.print(newLine+" ");
    }
}