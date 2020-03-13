
public class QuickSort {
	public void sort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int pivot = partition(arr, low, high);
			
			sort(arr, low, pivot-1);
			sort(arr, pivot+1, high);
		}
	}
	public int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int divider = low - 1;
		for(int i = low; i < high; i++)
		{
			if(pivot >= arr[i])
			{
				divider++; // move the pivot one cell to the right
				
				int temp = arr[i];
				arr[i] = arr[divider];
				arr[divider] = temp;
				
			}
		}
		int temp = arr[divider+1];
		arr[divider+1] = pivot;
		arr[high] = temp;
		
		return divider+1;
	}
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	public static void main(String args[])
	{
		int arr[] = {5, 3, 6, 10, 4, 2, 1};
		QuickSort hi = new QuickSort();
		hi.sort(arr, 0, arr.length-1);
		 System.out.println("sorted array"); 
		printArray(arr);
		
	}
}
