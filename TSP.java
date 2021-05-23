package class_ques;

import java.util.Scanner;

public class TSP
{
	static int tsdp(int [][] c, int [] tour, int start, int n){
        int [] mintour = new int[10], temp = new int[10];
        int mincost = 9999, ccost, i, j, k;
        if (start == n - 1) {
            return (c[tour[n-1]][tour[n]]+c[tour[n]][1]);
        }
        for (i = start + 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                temp[j] = tour[j];
            }
        }
        temp[start + 1] = tour[i];
        temp[i] = tour[start + 1];
        if (c[tour[start]][tour[i]] + (ccost=tsdp(c, temp, start+1, n)) < mincost) {
            mincost = c[tour[start]][tour[i]] + ccost;
            for (k = 1; k <=n; k++) {
                mintour[k] = temp[k];
            }
        }
        for (i = 1; i <= n; i++) {
            tour[i] = mintour[i];
        }
        return mincost;
    }

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int [][] c = new int [10][10];
        int [] tour = new int[10];
        int i, j, cost, n;
        System.out.print("Enter the no of cities: ");
        n = z.nextInt();
        if (n == 1) {
            System.out.println("Path is not possible.");
            System.exit(0);
        }
        System.out.println("Enter the cost matrix:");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                c[i][j] = z.nextInt();
            }
        }

        for (i = 1; i <=n; i++) {
            tour[i] = i;
        }
        cost = tsdp(c, tour, 1, n);
        System.out.println("The optimal tour is:");
        for (i = 1; i <= n; i++) {
            System.out.print(tour[i] + ":->");
        }
        System.out.println("1");
        System.out.println("Min cost: " + cost);

    }

}