/*题目：用@打印一个n行的金字塔如下图所示
 * 					行数		空格		@个数
 * 			@ 		 0		 3		 1
 * 		   @@@		 1 		 2		 3
 * 		  @@@@@		 2		 1		 5	
 * 		 @@@@@@@ 	 3		 0		 7
 * 		   ...
 * 思路：
 * 1.第i行有2i+1个@
 * 2.第i行有n-1-i个空格
 * 3.建立一个外层循环，控制打多少行@
 * 4.建立一个内层循环，控制打多少个空格
 * 5.建立一个内层循环，控制打多少个@
 */
import java.io.*;
public class Ey 
{	
	public static void main(String args[]) throws Exception
	{
	int n=8;
	System.out.println("请输入希望打印的金字塔的层数");
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
