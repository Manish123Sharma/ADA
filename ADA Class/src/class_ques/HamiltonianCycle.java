package class_ques;
public class HamiltonianCycle
{
	static int n = 5;
	static int[] x = new int[n + 1];
	static int graph[][] = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 1, 1 }, { 0, 0, 1, 0, 0, 1 },
			{ 0, 1, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0 }, };
	public static void hamiltonian(int k)
	{
		do
		{
			nextValue(k);
			if (x[k] == 0)
			{
				return;
			}
			if (k == n)
			{
				for (int j = 1; j < x.length; j++)
				{
					System.out.println(x[j]);
				}
			}
			else
			{
				hamiltonian(k + 1);
			}
		}while (true);
	}
	public static void nextValue(int k)
	{
		int j;
		do
		{
			x[k] = (x[k + 1]) % (n + 1);
			if (x[k] == 0)
			{
				return;
			}
			if (graph[x[k - 1]][x[k]] != 0)
			{
				for (j = 1; j < (k - 1); j++)
				{
					if (x[k] == x[j])
					{
						break;
					}
					if (j == k)
					{
						if (k < n || ((k == n) && (graph[x[n]][1] != 0)))
						{
							return;
						}
					}
				}
			}
		} while (true);
	}
	public static void main(String[] args)
	{
		hamiltonian(5);
	}
}