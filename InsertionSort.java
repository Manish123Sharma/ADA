package ADA;
import java.util.Scanner;
public class InsertionSort {
    static int[] iSort(int arr[])
    {
        int i,j,k;
        for(i=1;i<5;i++) {
          k = arr[i];
          for (j=i-1;j>=0 && arr[j]>k;j--)
          {
             arr[j+1]=arr[j];
          }
            arr[j+1] = k;
        }
        return arr;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int arr[] = new int[5];
        for(i=0;i<5;i++) {
            System.out.print("enter the value == ");
            arr[i] = sc.nextInt();
        }

        int a[] = new int[5];
        a= iSort(arr);
        System.out.println("INSERTION SORT= ");
        for(i=0;i<5;i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
