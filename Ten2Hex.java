
public class Ten2Hex 
{
		public static void main(String args[]) 
		{
			int num = 198;
			StringBuffer sb = new StringBuffer();
			while(num>0)
			{
				int temp = num%16;
				if(temp>9) 
				{
					sb.append((char)(temp-10+'A'));	
				}
				else
				{
					sb.append(temp);
				}
				num = num/16;
			}
			sb.reverse();
			System.out.println(sb);
		}
}
