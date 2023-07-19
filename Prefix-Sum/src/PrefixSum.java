import java.util.Scanner;

public class PrefixSum {
    public static int[] findPrefixSum(int[] arr, int n){
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]= scanner.nextInt();
        int[] a = new int[n];
        a = findPrefixSum(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
