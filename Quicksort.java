public class QuickSort{
	public void sort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int p = partition(arr,low,high);
			
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}
	public int partition(int arr[], int low, int high)
	{
		//pivot for highest
		int p = arr[high];
		int divider = low - 1;
		for(int j = low; j < high; j++)
		{
			if(p >= arr[j])
			{
				divider++;
				int temp = arr[j];
				arr[j] = arr[divider];
				arr[divider] = temp;
			}
		}
		divider++;
		int temp = arr[divider];
		arr[divider] = p;
		arr[high] = temp;
		
		return divider;
	}
	public void print(int arr[])
	{
		for(int i = 0 ; i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,3,5,57,4,2,5,2,1,-1,3};
		QuickSort myQuick = new QuickSort();
		myQuick.sort(arr,0,arr.length-1);
		myQuick.print(arr);
		
	}
}
