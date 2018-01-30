import java.util.*;
import java.io.*;

public class p12 
{
	private static int triangle(int n)
	{
		if(n == 0)
			return 0;
		return n + triangle(n - 1);
	}
	
	private static int numDivisors(int n)
	{
		int count = 0;
		for(int i = 1; i <= n; i++)
			if(n % i == 0)
				count++;
		return count;
	}
	public static void main(String[] args)
	{
		for(int i = 1; i < Integer.MAX_VALUE; i++)
		{
			int result = triangle(i);
			int numDivisors = numDivisors(result);
			if(numDivisors > 500)
			{
				System.out.println(result);
				break;
			}
		}
	}
}
