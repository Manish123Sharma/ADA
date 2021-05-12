package class_ques;
public class Sorting
{
	public static void  selection()
	{
		int array[] = {2,7,3,6,4,5};
		for(int i =0;i<array.length;i++)
		{
			for(int j =i;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int n = 0;
					n = array[i];
					array[i]=array[j];
					array[j]=n;
				}
			}
		}
	    for(int i =0;i<array.length;i++)
	    {
	    	System.out.print(" "+ array[i]);
	    }
	    System.out.println();
	}
	public static void insertionsort() 
    {
		int arr[]= {4,9,7,6,3,2,1,8}; 
        for(int i = 1; i < arr.length; ++i)
        { 
            int n = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > n)
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = n; 
        }
        for(int i =0;i<arr.length;i++)
	    {
	    	System.out.print(" "+ arr[i]);
	    }
        System.out.println();
    }
	public static void bubbleSort()
	{
    	int ar[]= {8,9,7,6,5,4,0};
        for(int i = 0; i <ar.length ; i++) 
        {
        	for(int j = 0; j <ar.length-1 ; j++)
        	{
                if(ar[j]>ar[i])
                {
                	int n;
                    n = ar[i];
                    ar[i]= ar[j];
                    ar[j] = n;
                }
            }
        }
        for(int i =0;i<ar.length;i++)
	    {
	    	System.out.print(" "+ ar[i]);
	    }
        System.out.println();
    }
	public static void main(String args[])
	{
		System.out.println(" selection sort ");
		selection() ;
		System.out.println(" insertion sort ");
        insertionsort();
        System.out.println(" bubble sort ");
        bubbleSort();
	}
}