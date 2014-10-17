/*Author:Tian Qi 
 *Edit Date:2014.10.10
 * 要求：给定一个十进制数 用移位完成相对十六进制的转换
 *思路：1.将十进制数与0x0000000F进行与运算，完成低四位的保存
 *    2.将给定数右移四位，循环上述操作 共8次
 *    3.用一个StringBuffer存数并反向
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
