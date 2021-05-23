package class_ques;
public class Prims
{
	public static void main(String[] args)
	{
		int[][] graph = { { 100, 1, 4, 2, 100 }, { 3, 100, 100, 5, 7 }, { 100, 8, 100, 100, 7}, { 1, 4, 100, 100, 5 },{ 100, 6, 11, 12, 100 } };
		int arr[] = prim(graph);
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
	public static int[] prim(int[][] arr)
	{
		int[] r = { 4, 0, 0, 0, 0 };
		int rc = 0;
		int v = 0; 
		int w = 0;
		for(int m = 1; m < 5; m++)
		{
			int min = 100;
			for(int j = 0; j < rc; j++)
			{
				for(int i = 0; i < 5; i++)
				{
					if(min > arr[r[j]][i])
					{
						v = i;
						w = r[j];
						min = arr[r[j]][i];
					}
				}
			}
			rc++;
			r[rc] = v;
			arr[v][w] = arr[w][v] = 100;
		}
		return r;
	}
	
}