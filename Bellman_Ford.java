package ADA;

public class Bellman_Ford {

    public  static void bellmanFordAlgo(int G[][], int V, int E, int source)
    {

        int []dis = new int[V];
        for (int i = 0; i < V; i++)
            dis[i] = Integer.MAX_VALUE;

        dis[source] = 0;

        for (int i = 0; i < V - 1; i++)
        {

            for (int j = 0; j < E; j++)
            {
                if (dis[G[j][0]] != Integer.MAX_VALUE && dis[G[j][0]] + G[j][2] < dis[G[j][1]])
                    dis[G[j][1]] = dis[G[j][0]] + G[j][2];
            }
        }


        for (int i = 0; i < E; i++)
        {
            int x = G[i][0];
            int y = G[i][1];
            int weight = G[i][2];
            if (dis[x] != Integer.MAX_VALUE &&
                    dis[x] + weight < dis[y])
                System.out.println(" --- Negative Cycle ---");
        }

        System.out.println(" Distance of Vertex  from Src");
        for (int i = 0; i < V; i++)
            System.out.println(i + "\t\t" + dis[i]);

    }

    public static void main(String[] args)
    {
        int V = 5;
        int E = 8;


        int graph[][] = {
                { 0, 1, -1 },
                { 0, 2, 6 },
                { 1, 2, 9 },
                { 1, 3, -2 },
                { 1, 4, -7 },
                { 3, 2, 3 },
                { 3, 1, 2 },
                { 4, 3, 8 }
        };

        bellmanFordAlgo(graph, V, E, 0);
    }
}
