package ADA;
import java.util.*;
public class Dijkastra{
    public static void main(String[] args)
    {
        int adjacencymatrix[][] = new int[][] {
                { 0, 10, 3, 0, 0},
                { 0, 0, 1, 2, 0},
                { 0, 4, 0, 8, 2},
                { 0, 0, 0, 0, 7},
                { 0, 0, 0, 9, 0 }};
        dijskatra(adjacencymatrix);
    }
    private static int findMinVertex(int distance[],boolean visited[]){
        int minVertex=-1;
        for(int i =0;i<distance.length;i++){
            if(!visited[i] && (minVertex==-1 || distance[i]<distance[minVertex])){
                minVertex=i;
            }
        }
        return minVertex;
    }
    private static void dijskatra(int[][] matrix){
        int v=matrix.length;
        boolean visited[]=new boolean[v];
        int[] distance = new int[v];
        distance[0]=0;
        int vert[]=new int[v-1];
        for(int i=1;i<v;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<v-1;i++){
            int minVertex=findMinVertex(distance,visited);
            visited[minVertex]=true;
            vert[i]=minVertex;
            for(int j=0;j<v ; j++){
                if(matrix[minVertex][j]!=0 && !visited[j] && distance[minVertex]!=Integer.MAX_VALUE){
                    int newDist=distance[minVertex]+matrix[minVertex][j];
                    if(newDist<distance[j]){
                        distance[j]=newDist;
                    }
                }
            }
        }
        for(int i=0;i<v;i++){
            System.out.println(i+" "+distance[i]);
        }
//        System.out.println("SEQUENCE OF VERTEX");
//        for(int i=0;i<v-1;i++){
//            System.out.print(vert[i]+" ->");
//        }

    }
}
