import java.util.*;
class MergeInZigZagOrder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]arr = new int[n];
        int[]arr1 = new int[m];
        int[] ans = new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        int i =0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            ans[k++] = arr[i++];
            ans[k++] = arr1[j++];
        }
        while(i<n){
            ans[k++]=arr[i++];
        }
        while(j<m){
            ans[k++]=arr1[j++];
        }
        for(int l=0;l<ans.length;l++){
            System.out.print(ans[l]+" ");
        }
    }
}