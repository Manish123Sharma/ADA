package ADA;
import java.util.Scanner;
public class Knapsack {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the number of items n: ");
        int n = reader.nextInt();
        System.out.println("Please input the backpack capacity c: ");
        float c = reader.nextFloat();
        float[] w = new float[n + 1];
        float[] v = new float[n + 1];
        for (int i = 0; i < n; i++) {
            w[i] = (float) Math.floor(Math.random() * 200);
        }
        System.out.println("The weight of the item is:");
        for (int j = 0; j < n; j++) {
            System.out.print(w[j] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            v[i] = (float) Math.floor(Math.random() * 2000);
        }
        System.out.println("The value of the item is:");
        for (int j = 0; j < n; j++) {
            System.out.print(v[j] + " ");
        }
        System.out.println("");
        float[] x = new float[n + 1];
        Knapsack p = new Knapsack();
        p.Sort(n,v,w);
        float s = p.Knapsack(w, v, x, c, n);
        System.out.println("The final value of the optimal solution is:" + s);
    }

    float Knapsack(float w[], float v[], float x[], float c, int n) {
        float total = 0;
        int i;
        for (i = 0; i < n; i++)
            x[i] = 0;
        i = 1;
        while (w[i] < c) {
            x[i] = 1;
            total = total + v[i];
            c = c - w[i];
            i++;
        }
        x[i] = c / w[i];
        total = total + x[i] * v[i];
        System.out.println("The solution of the problem is as follows:");
        for (int j = 0; j < n; j++) {
            System.out.print(x[j] + " ");
        }
        System.out.println("");
        return total;
    }

    private void Sort(int n, float v[], float w[]) {//Sort from large to small
        int i;
        float j;
        float k;
        for (i = 0; i < n; i++) {
            if (v[i + 1] / w[i + 1] > v[i] / w[i]) {
                j = v[i];
                k = w[i];
                v[i] = v[i + 1];
                w[i] = w[i + 1];
                v[i + 1] = j;
                w[i + 1] = k;
            }
        }
    }
}
