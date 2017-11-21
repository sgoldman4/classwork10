
public class SortTest 
{

	public static void main(String[] args) 
	{
		int[] values = {1,-1,42,90,-5,4,1,-96};
		SortingAlgorithms.selectionSort(values);
		SortingAlgorithms.printArray(values);
		
		String[] names = {"Christina", "Angie",
				"Yu Feng", "David", "Hashir", "Tayler",
				"Andy", "Masiah", "Simon", "Jeffrey",
				"Ethan", "Richard", "Zhen Yi",
				"Ye Cheng", "Luis", "Umarbek",
				"Burlyn", "Carmen", "Kathy", "Divya",
				"Hammad", "Lukasz", "Conor", "Terry",
				"Zaarib", "Nikos", "Vlad", "Vova",
				"Yuki", "Amy", "Sharon"};
		
		SortingAlgorithms.selectionSort(names);
		SortingAlgorithms.printArray(names);
	}
}
