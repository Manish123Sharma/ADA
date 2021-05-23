package class_ques;

import java.util.Scanner;

public class Fibonacci
{
	static int a=0,b=1,c=0;
    static void printFibonacci(int n)
    {
        if(n>0)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
            printFibonacci(n-1);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter the value of n");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.print(a+" "+b);
        printFibonacci(n-2);
    }
}