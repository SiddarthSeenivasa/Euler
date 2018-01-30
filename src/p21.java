import java.util.*;
import java.io.*;
public class p21 
{
	private static int isAmicable(int x)
	{
		int result = 0;
		
		int sum1 = 0;
		for(int i = 1; i < x; i++)
			if(x % i == 0)
				sum1 += i;
		
		if(sum1 == x)
			return result;
		
		int sum2 = 0;
		for(int i = 1; i < sum1; i++)
			if(sum1 % i == 0)
				sum2 += i;
		
		if(sum2 == x)
			result = x;
		
		return result;
			
	}
	
	public static void main(String[] args)
	{
		long sum = 0;
		for(int i = 1; i < 10000; i++)
		{
			sum += isAmicable(i);
		}
		
		System.out.println(sum);
	}

}
