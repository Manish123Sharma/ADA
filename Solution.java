package ADA;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        //To Generate Random Numbers
        Random random = new Random();

        //ArrayList's according to the Question
        int[] randomNumbers = new int[100];
        int[] ascendingOrderNumbers = new int[100];
        int[] descendingOrderNumbers = new int[100];

        // Random Numbers
        for (int i = 0; i < 100; i++){
            int randomNumber = random.nextInt(1000);
            randomNumbers[i] = randomNumber;
        }

        // Ascending Order Numbers
        for (int i = 0; i < 100; i++){
            ascendingOrderNumbers[i] = i;
        }

        // Descending Order Numbers
        for (int i = 100; i > 0; i--){
            descendingOrderNumbers[100 - i] = i;
        }

        // New Instance for the Solution Class
        Solution solution = new Solution();

        // Time Calculation for Random Numbers
        long startRandom = System.nanoTime();
        //Merge Sort for Random Numbers
        solution.sort(randomNumbers,0,randomNumbers.length-1);
        long endRandom = System.nanoTime();
        long timeRandom = endRandom - startRandom;


        //Time Calculation for Ascending Numbers
        long startAscending = System.nanoTime();
        //Merge Sort for Ascending Numbers
        solution.sort(ascendingOrderNumbers,0,ascendingOrderNumbers.length-1);
        long endAscending = System.nanoTime();
        long timeAscending = endAscending - startAscending;


        //Time Calculation for Descending Numbers
        long startDescending = System.nanoTime();
        //Merge Sort for Descending Numbers
        solution.sort(descendingOrderNumbers,0,descendingOrderNumbers.length-1);
        long endDescending = System.nanoTime();
        long timeDescending = endDescending - startDescending;

        printArray(randomNumbers);
        printArray(ascendingOrderNumbers);
        printArray(descendingOrderNumbers);
        System.out.println("Time for merge Sort for Random Numbers : " +timeRandom);
        System.out.println("Time for merge Sort for Ascending Numbers : " +timeAscending);
        System.out.println("Time for merge Sort for Descending Numbers : " +timeDescending);



    }

    void sort(int arr[], int beg, int end) {
        if (beg<end) {
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr , mid+1, end);
            merge(arr, beg, mid, end);
        }
    }


    void merge(int arr[], int beg, int mid, int end) {

        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int [l];
        int RightArray[] = new int [r];

        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            }
            else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}