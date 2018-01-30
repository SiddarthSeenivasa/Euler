import java.util.*;
import java.io.*;

public class p34 
{
	public static ArrayList<Integer> digitStripper(int x)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(x != 0)
		{
			result.add(0, x % 10);
			x /= 10;
		}
		return result;
	}
	
	public static int fact(int x)
	{
		if(x == 0)
			return 1;
		return x * fact(--x);
	}
	public static void main(String[] args) 
	{
		long sum = 0;
		for(int i = 3; i < 100000000; i++)
		{
			ArrayList<Integer> test = digitStripper(i);
			long bigsum = 0;
			for(int x : test)
				bigsum += fact(x);
			if(bigsum == i)
				sum += i;
		}
		
		System.out.println(sum);
	}
	
}
