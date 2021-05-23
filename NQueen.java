package class_ques;

import java.util.Scanner;

public class NQueen
{
	static int x[];
    public static boolean place(int k)
    {
        int i;
        for (i = 1; i < k; i++)
        {
            if ((x[i] == x[k]) || ((x[i] - x[k]) == (i - k)))
            {
                return false;
            }
        }
        return true;
    }
    public static void nQueen(int n)
    {
        x = new int[n + 1];
        int k = 1;
        x[k] = 0;
        while (k > 0)
        {
            x[k] = x[k] + 1;
            while (x[k] <= n && !place(k))
            {
                x[k] = x[k] + 1;
            }
            if (x[k] <= n)
            {
                if (k == n)
                {
                    System.out.println("For " + n + " queens: ");
                    for (int j = 1; j <= n; j++)
                    {
                        System.out.print(x[j] + " ");
                    }
                    break;
                }
                else
                {
                    k = k + 1;
                    x[k] = 0;
                }
            }
            else
            {
                k = k - 1;
            }
        }
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        nQueen(n);
        sc.close();
    }
}