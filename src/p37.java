import java.io.*;
import java.util.*;

public class p37
{
	private static ArrayList<Integer> eleven = new ArrayList<Integer>();
	
	private static ArrayList<Integer> right  = new ArrayList<Integer>();
	
	private static ArrayList<Integer> left = new ArrayList<Integer>();
	
	public static void ds(int x)
	{
		int x1 = x;
		String x2 = "" + x;
		
		while(x1 != 0)
		{
			right.add(x1);
			x1 /= 10;
		}
		
		for(int i = x2.length() - 1; i <= 0; i--)
		{
			left.add(Integer.parseInt(x2.substring(i, x2.length())));
		}
	}
	
	public static boolean isPrime(int x)
	{
		if(x < 2)
			return false;
		if(x == 2)
			return true;
		if(x % 2 == 0)
			return false;
		for(int i = 3; i * i <= x; i+=2)
			if(x % i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 10000000; i++)
		{
			if(isPrime(i))
			{
				ds(i);
				boolean l = true;
				boolean r = true;
				for(int x : left)
					if(!isPrime(x))
						l = false;
				for(int k : right)
					if(!isPrime(k))
						r = false;
				if(l && r)
					eleven.add(i);
				else
				{
					right.clear();
					left.clear();
				}
			}
		}
		long sum = 0;
		for(int x : eleven)
			sum += x;
		System.out.println(sum);
	}
}