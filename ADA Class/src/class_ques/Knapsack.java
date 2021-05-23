package class_ques;
import java.util.*;
public class Knapsack
{
	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter no. of items");
    	int n = sc.nextInt();
    	Random random = new Random();
        int[] wt = new int[n];
        int[] val = new int[n];
        for(int i = 0; i < n; i++)
        {
            int randomNumber = random.nextInt(100);
            wt[i] = randomNumber;
            int rannum = random.nextInt(100);
            val[i] = rannum + 100;
        }
        System.out.println("enter capacity");
        int capacity = sc.nextInt();
        sc.close();
        double maxValue = getMaxValue(wt, val, capacity);
        System.out.println("Maximum value we can obtain = "+ maxValue);
        System.out.println("Array of Weights : "+Arrays.toString(wt));
        System.out.println("Array of Values : "+Arrays.toString(val));
    }
	static class ItemValue
	{
        Double cost;
        double wt, val, ind;
        public ItemValue(int wt, int val, int ind)
        {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = ((double)val / (double)wt);
        }
    }
	private static double getMaxValue(int[] wt, int[] val,int capacity)
	{
		ItemValue iVal[] = new ItemValue[wt.length];
		for(int i = 0; i < wt.length; i++)
		{
			iVal[i] = new ItemValue(wt[i], val[i], i);
		}
		Arrays.sort(iVal, new Comparator<ItemValue>()
		{
			@Override
			public int compare(ItemValue o1, ItemValue o2)
			{
				return o2.cost.compareTo(o1.cost);
			}
		});
		double totalValue = 0d;
		for(ItemValue i : iVal)
		{
			int curWt = (int)i.wt;
			int curVal = (int)i.val;
			if(capacity - curWt >= 0)
			{
				capacity = capacity - curWt;
				totalValue = totalValue + curVal;
			}
			else
			{
				double fraction= ((double)capacity / (double)curWt);
				totalValue += (curVal * fraction);
				capacity= (int)(capacity - (curWt * fraction));
				break;
			}
		}
		return totalValue;
	}
}