import java.util.*;
class removeDuplicate{
    public void Remove(int[]arr){
        int n = arr.length;
        int j =1;
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i]){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        removeDuplicate rd = new removeDuplicate();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Remove(arr);
         rd.Remove(arr);
    }
}