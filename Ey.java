/*��Ŀ����@��ӡһ��n�еĽ���������ͼ��ʾ
 * 					����		�ո�		@����
 * 			@ 		 0		 3		 1
 * 		   @@@		 1 		 2		 3
 * 		  @@@@@		 2		 1		 5	
 * 		 @@@@@@@ 	 3		 0		 7
 * 		   ...
 * ˼·��
 * 1.��i����2i+1��@
 * 2.��i����n-1-i���ո�
 * 3.����һ�����ѭ�������ƴ������@
 * 4.����һ���ڲ�ѭ�������ƴ���ٸ��ո�
 * 5.����һ���ڲ�ѭ�������ƴ���ٸ�@
 */
import java.io.*;
public class Ey 
{	
	public static void main(String args[]) throws Exception
	{
	int n=8;
	System.out.println("������ϣ����ӡ�Ľ������Ĳ���");
	int x=System.in.read();
	for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			System.out.print("  ");
			for(int k=0; k<2*i+1; k++)			
			System.out.print("@ ");
			System.out.println();									
		}
	System.out.println(x);
	}
}
