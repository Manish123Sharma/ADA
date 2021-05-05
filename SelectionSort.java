package ADA;
import java.util.Scanner;
public class SelectionSort {
    static int[] sSort(int arr[])
    {
        int i,j,min=0,temp=0;
        for(i=0;i<4;i++) {
            min=i;
            for(j=i+1;j<5;j++)
            {
                if(arr[j]<arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        a= sSort(arr);
        System.out.println("SELECTION SORT= ");
        for(i=0;i<5;i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
