
public class p14 
{
	public static int func(long x)
	{
		if(x == 1)
			return 1;
		if(x % 2 == 0)
			return 1 + func(x / 2);
		else
			return 1 + func((3 * x) + 1);
	}
	
	public static void main(String[] args)
	{
		int longest = 0;
		int num = 1;
		for(int i = 1; i < 1000000; i++)
		{
			int temp = func(i);
			if(temp > longest)
			{
				longest = temp;
				num = i;
			}
		}
		
		System.out.println(num);
	}

}
