package ADA;
import java.util.Scanner;
public class BubbleSort {
    static int[] bSort(int arr[]) {
        int temp=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int arr[] = new int[5];
        for(i=0;i<5;i++) {
            System.out.print("enter ur number == ");
            arr[i] = sc.nextInt();
        }
        int a[] = new int[5];
        a= bSort(arr);
        System.out.println("BUBBLE SORT ");
        for(i=0;i<5;i++) {

            System.out.print(a[i]+" ");
        }
    }
}