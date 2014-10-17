
import java.util.Arrays;
public class ArraySearch 
{
	public static void main(String args[])
	{
		int array[]=new int [] {2,4,321,84,22,0,125};
		int index=Arrays.binarySearch(array, 84);
		System.out.println("84的索引位置是"+index);
	}
}
