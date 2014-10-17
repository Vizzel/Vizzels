//Author:Vizzel
//Date:2014.10.10
//����
//��ʼֻ��дһ��ѡ������ �󸽼���ð������Ͳ�������
public class SelectSort 
{
	public static void main(String args[])
	{
		int array[]={22,12,321,32,54,76,434,5,0,533};
		System.out.println("δ����ǰ������Ϊ");
		ListArray(array);
		System.out.println("ѡ������������Ϊ");
		Select(array);	
		ListArray(array);
		System.out.println("ð������������Ϊ");
		BubbleSort(array);
		ListArray(array);
		System.out.println("��������������Ϊ");
		InsertSort(array);
		ListArray(array);
	}
	//ѡ������
	static void Select(int array[])
	{
		for(int i=0; i<array.length-1; i++)
		{
			int max = array[i];
			int pos = i;
			for(int j=i+1; j<array.length; j++)
			{
				if(max<array[j])
				{
					max=array[j];
					pos=j;
				}
			}
			Swap(array,i,pos);
		}
	}
	//ð������
	static void BubbleSort(int array[])
	{
		for(int i=0; i<array.length; i++)
		{
			for(int j=array.length-1; j>i; j--)
			{
				if(array[j-1]>array[j])
					Swap(array,j,j-1);
			}
		}
			
	}
	//��������
	static void InsertSort(int array[])
	{
		for(int i=1; i<array.length; i++)
		{
			int pos = i;
			while(pos>0 && array[pos]>array[pos-1])
			{
				Swap(array, pos, pos-1);
				pos--;
			}
		}
	}
	//��������ӡ����
	static void ListArray(int array[])
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<array.length;i++)
		{
			sb.append(array[i]+",");
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.println(sb);
	}
	//�������������ֵ
	static void Swap(int array[],int x1, int x2)
	{
		int temp = array[x1];
		array[x1] = array[x2];
		array[x2] = temp;		
	}
}