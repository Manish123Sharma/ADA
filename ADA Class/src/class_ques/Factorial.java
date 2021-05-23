package class_ques;

import java.util.Scanner;

public class Factorial
{
	static int fact(int n){
        if (n == 0)
            return 1;
        else
            return(n * fact(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        System.out.println("Enter the Value of n");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int f = fact(num);
        System.out.print("Factorial is: "+f);
    }
}