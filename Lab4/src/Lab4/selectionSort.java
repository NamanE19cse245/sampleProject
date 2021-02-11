package Lab4;

class selectionSort {
	
	int[] array;
	selectionSort(int[] array)
	{
		this.array = array;
	}
	
	int[] Sort()
	{
		int smallest;
		int position;
		for(int i=0;i<array.length;i++)
		{
			smallest = array[i];
			position = i;
			for(int j=i;j<array.length;j++)
			{
				if(smallest>array[j])
				{
					smallest = array[j];
					position = j;
				}
			}
			int temp = array[i];
			array[i] = array[position];
			array[position] = temp;
		}
		
		System.out.println("Selection sort complete");
		return array;
	}
}
