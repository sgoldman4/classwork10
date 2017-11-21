public class SortingAlgorithms 
{
	public static void selectionSort(int[] arr)
	{
		for (int pivot = 0; pivot < arr.length-1; pivot++)
		{
			int lowPosition = pivot;
			for (int k = pivot + 1; k < arr.length; k++)
			{
				if (arr[k] < arr[lowPosition])
					lowPosition = k;
			}
			int temp = arr[pivot];
			arr[pivot] = arr[lowPosition];
			arr[lowPosition] = temp;
		}
	}
	
	public static void selectionSort(String[] arr)
	{
		for (int pivot = 0; pivot < arr.length-1; pivot++)
		{
			int lowPosition = pivot;
			for (int k = pivot + 1; k < arr.length; k++)
			{
				if (arr[k].compareTo(arr[lowPosition]) < 0)
					lowPosition = k;
			}
			String temp = arr[pivot];
			arr[pivot] = arr[lowPosition];
			arr[lowPosition] = temp;
		}		
	}
		
	public static void printArray(int[] arr)
	{
		for (int num : arr)
			System.out.print(num + ",");
		System.out.println();
	}
	
	public static void printArray(String[] arr)
	{
		for (String str : arr)
			System.out.print(str + ",");
		System.out.println();
	}
}
