package class_ques;

import java.util.Scanner;

public class NQueen
{
	private static int N;

    private static int[][] board = new int[100][100];


    private static boolean isAttack(int i,int j)
    {
        int k,l;

        for(k=0;k<N;k++)
        {
            if((board[i][k] == 1) || (board[k][j] == 1))
                return true;
        }

        for(k=0;k<N;k++)
        {
            for(l=0;l<N;l++)
            {
                if(((k+l) == (i+j)) || ((k-l) == (i-j)))
                {
                    if(board[k][l] == 1)
                        return true;
                }
            }
        }
        return false;
    }

    private static boolean nQueen(int n)
    {
        int i,j;

        if(n==0)
            return true;
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if((!isAttack(i,j)) && (board[i][j]!=1))
                {
                    board[i][j] = 1;
                    if(nQueen(n-1)==true)
                    {
                        return true;
                    }
                    board[i][j] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of N for NxN chessboard");
        N = s.nextInt();

        int i,j;
        nQueen(N);
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
                System.out.print(board[i][j]+"\t");
            System.out.print("\n");
        }

    }
}