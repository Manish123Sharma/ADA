package ADA;

import java.util.Arrays;
import java.util.*;

class Prims {
    long starttime= System.nanoTime();
    public void Prim(int G[][], int V) {
        int no_edge;
        boolean[] selected = new boolean[V];
        Arrays.fill(selected, false);
        no_edge = 0;
        selected[0] = true;
        while (no_edge < V - 1) {
            int min = 9999999;
            int x = 0;
            int y = 0;

            for (int i = 0; i < V; i++) {
                if (selected[i]) {
                    for (int j = 0; j < V; j++) {
                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }

            // Long endtime= System.nanoTime();
            // long timeelapsed= endtime - starttime;
            System.out.println(x + " - " + y + " :  " + G[x][y]);
            // System.out.println("Time Taken : "+ timeelapsed);
            selected[y] = true;
            no_edge++;
        }
        long endtime2= System.nanoTime();
        System.out.println("Time to execute all : "+ (endtime2 - starttime));
    }

    public static void main(String[] args) {
        Prims g = new Prims();
        int V = 5;
        int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
                { 0, 42, 66, 31, 0 } };

        g.Prim(G, V);
    }
}