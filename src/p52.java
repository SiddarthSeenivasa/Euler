import java.util.*;
import java.io.*;

public class p52 
{
	private static ArrayList<Integer> digitInserter(int x)
	{
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		while(x != 0)
		{
			y.add(0, x % 10);
			x /= 10;
		}
		
		return y;
	}
	public static void main(String[] args)
	{
		for(int i = 1; i < 1000000; i++)
		{
			int x = i;
			int x2 = 2 * i;
			int x3 = 3 * i;
			int x4 = 4 * i;
			int x5 = 5 * i;
			int x6 = 6 * i;
			
			ArrayList<Integer> a = digitInserter(x);
			Collections.sort(a);
			ArrayList<Integer> b = digitInserter(x2);
			Collections.sort(b);
			ArrayList<Integer> c = digitInserter(x3);
			Collections.sort(c);
			ArrayList<Integer> d = digitInserter(x4);
			Collections.sort(d);
			ArrayList<Integer> e = digitInserter(x5);
			Collections.sort(e);
			ArrayList<Integer> f = digitInserter(x6);
			Collections.sort(f);
			
			
			if(a.equals(b) && a.equals(c) && a.equals(d) && a.equals(e) && a.equals(f))
				System.out.println(i);
			
		}
		
	}
}
