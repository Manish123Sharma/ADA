package class_ques;
public class Quick_sort
{
	public static void main(String args[])
	{
		Quick_sort qs2 = new Quick_sort();
		int arr[] = {8,9,8,3,2,5,6,1,6,7};
		int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		int arr2[]= {6,6,6,6,6,6,6,6,6,6};
		int n = arr.length;
		qs2.Sort(arr,0, n-1);
		printArray(arr);
	    System.out.println(" Recursive Calls  --> " +b);
	    b=0;
	    qs2.Sort(arr1,0, n-1);
		printArray(arr1);
		System.out.println(" Recursive Calls  --> " +b);
		b=0;
		qs2.Sort(arr2,0, n-1);
		printArray(arr2);
		System.out.println(" Recursive Calls  --> " +b);
		
	}
	static int b =0;
	int partition(int arr[],int lb ,int ub)
    {
    	int beg=lb;
    	int end = ub;
    	int key=arr[beg];
    	while(beg<end)
    	{
    		while(arr[beg]<=key && beg<ub)
    		{
    			beg++;
    		}
    		while(arr[end]>key  && end>lb)
    		{
    			end--;
    		}
    		if(beg<end)
    		{ 
    			int n =arr[end];
    			arr[end]=arr[beg];
    			arr[beg]=n;
    		} 	
    	}
    	int n =arr[lb];
    	arr[lb]=arr[end];
    	arr[end]=n;
    	return end;
    }
	void Sort(int arr[], int lb, int ub)
	{
		if(lb<ub)
		{
			int a = partition(arr,lb,ub);
			Sort(arr,lb,a-1);
			Sort(arr,a+1,ub);
		}
		b++;
	}
	static void printArray(int arr[])
	{
        int n = arr.length;
        for(int i = 0; i < n; ++i)
        {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}