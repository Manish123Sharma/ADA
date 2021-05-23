package class_ques;
import java.util.Random;
import java.util.Scanner;
public class Knapsack01
{
	public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of items: ");
        int n = sc.nextInt();
        int[] weight = new int[n];
        for (int i = 0; i < n; i++)
        {
            weight[i] = rn.nextInt(10);
        }
        int[] value = new int[n];
        for (int i = 0; i < n; i++)
        {
            value[i] = rn.nextInt(10);
        }
        System.out.println("Enter capacity: ");
        int c = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print(weight[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++)
        {
            System.out.print(value[i] + " ");
        }
        System.out.println();
        System.out.println(knapsack(c, weight, value, n));
        sc.close();
    }
	public static int knapsack(int cap, int weight[], int value[], int n)
	{
        int a[] = new int[cap + 1];
        int b[] = new int[cap + 1];
        for (int w = 0; w <= cap; w++)
        {
            b[w] = 0;
        }
        for (int k = 0; k < n; k++)
        {
            for (int i = 0; i <= cap; i++)
            {
                a[i] = b[i];
            }
            for (int w = weight[k]; w <= cap; w++)
            {
                if ((a[w - weight[k]] + value[k]) > a[w])
                {
//					System.out.println(weight[k] + " --> " + a[w - weight[k]]);
                    b[w] = a[w - weight[k]] + value[k];
                }
            }
        }
        return b[cap];
    }
}