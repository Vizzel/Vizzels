/*Author:Tian Qi 
 *Edit Date:2014.10.10
 * Ҫ�󣺸���һ��ʮ������ ����λ������ʮ�����Ƶ�ת��
 *˼·��1.��ʮ��������0x0000000F���������㣬��ɵ���λ�ı���
 *    2.��������������λ��ѭ���������� ��8��
 *    3.��һ��StringBuffer����������
 */

public class YiWeiPRAC 
{
	public static void main(String args[])
	{
		int num = 254;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<8; i++)
		{
			int temp = num & 0x0000000f;
			if(temp>9)
				sb.append((char)(temp-10+'A'));
			else
				sb.append(temp);
			num = num>>4;
		}
		sb.reverse();
		System.out.println(sb);
	}
}
