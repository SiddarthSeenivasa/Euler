import java.util.*;
import java.io.*;

public class p30 
{
	private static int[] digitStripper(int x)
	{
		int[] data = new int[Integer.parseInt("" + x)];
		int i = 0;
		while(x != 0)
		{
			data[i] = x % 10;
			x /= 10;
			i++;
		}
		
		return data;
	}
	public static void main(String[] args)
	{
		ArrayList<Long> data = new ArrayList<Long>();
	
		for(int i = 1; i < Integer.MAX_VALUE; i++)
		{
			int[] results = digitStripper(i);
			Long sum = new Long(0);
			for(int x : results)
				sum += (long) Math.pow(x, 5);
			Long compare = new Long(i);
			if(sum.equals(compare))
				data.add(new Long(i));
		}
		Long sum = new Long(0);
		for(Long s : data)
			sum += s;
		
		System.out.println(sum);
	
	}
}
