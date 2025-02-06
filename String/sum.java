import java.util.*;
class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr= new int[n][m];
        int [][]arr1 = new int[n][m];
        int [][]ans = new int[n][m];
        System.out.println("first input");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("second input");

        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("printing of sum as output");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
 
    }
}