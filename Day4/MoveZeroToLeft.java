import java.util.*;
class MoveZeroToLeft{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element in an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int[]ans = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                ans[k++]=arr[i];
            }
        }
        while(count-- > 0){
            ans[k++] = 0;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}