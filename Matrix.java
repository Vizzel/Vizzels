//import java.util.Arrays;
public class Matrix 
{
	public static void main(String args[])
	{
		int array[][]=new int[][] {{1,2},{10,20},{100,200,300},{2}};
		//Arrays.sort(array);
		for (int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			System.out.print("array["+i+"]"+"["+j+"]��ֵΪ:"+array[i][j]+"  ");
		System.out.println();
		}
	}

}
//����Ԫ���滻����  Arrays.fill()