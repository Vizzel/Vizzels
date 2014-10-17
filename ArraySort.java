import java.util.Arrays;
public class ArraySort
{
	public static void main(String args[])
	{
		int array[]=new int []{12,42,543,123,21,678,5432,8765,421,83};
		Arrays.fill(array,1,4,666);
		Arrays.sort(array);
		
		for (int i=0; i<array.length; i++)
		{
			System.out.print("array["+i+"]µÄÖµÎª:"+array[i]+" ");
		System.out.println();
		}
	}

}
