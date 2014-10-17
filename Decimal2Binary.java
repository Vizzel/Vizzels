
public class Decimal2Binary 
{
	public static void main(String[] args)
	{
	int n = 188;
	StringBuffer sb = new StringBuffer();
	while(n>0)
		{
		int temp = n%2;
		sb.append(temp);
		n /= 2;
		}
	sb.reverse();
	System.out.println(sb);
	}
}
