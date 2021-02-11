package Lab4;

public class Main {
	
	void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int[] array = {98,45,65,21,34,55,32,89,87,100};
		
		int[] array1 = array;
		
		bubbleSort b = new bubbleSort(array);
		array = b.Sort();
		
		Main m = new Main();
		m.printArray(array);
		
		System.out.println();
		
		selectionSort s = new selectionSort(array1);
		array1 = s.Sort();
		m.printArray(array1);
	}

}
