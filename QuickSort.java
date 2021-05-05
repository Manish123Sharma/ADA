package ADA;
// Quick Sort
import java.util.Random;
import java.util.Scanner;
public class QuickSort {
    void quickSort(int a[],int lb, int ub) {
        int i,j,t,x=0;
        i=lb;
        j=ub;
        while(i<j) {
            while (a[i] < a[j] && x == 1) {
                i++;
            }
            while (a[j] > a[i] && x == 0) {
                j--;
            }
            if (i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
            if (x == 0) {
                x = 1;
            } else {
                x = 0;
            }
        }
        if(lb<i) {
            quickSort(a,lb,i-1);
        }
        if(ub>i) {
            quickSort(a,i+1,ub);
        }
    }
//    static void display(int a[],int lb,int ub) {
//        for(int i=lb;i<=ub;i++) {
//            System.out.print(a[i]+"\t");
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QuickSort qs = new QuickSort();
        Random random = new Random();
        int[] a = new int[35];
        for (int i = 0; i < 35 ;i++){
            int rn = random.nextInt(1000);
            a[i] = rn;
        }
        int n=35;
//        int n = scan.nextInt();
//        int []a=new int[n];
//        System.out.println("Enter elements in array");
//        for(int i=0;i<n;i++)
//        {
//            a[i]= scan.nextInt();
//        }
        int lb = 0;
        int ub = n-1;
        long startRandom = System.nanoTime();
        int count = 0;
        System.out.println("Hi");
        qs.quickSort(a,lb,ub);
        System.out.println("Hi2");
        long endRandom = System.nanoTime();
        long timeRandom = endRandom - startRandom;
        System.out.println("Time taken = "+timeRandom);
    }
}