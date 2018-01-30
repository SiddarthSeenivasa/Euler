import java.util.*;
import java.io.*;

public class p40 
{
	public static ArrayList<Integer> digits = new ArrayList<Integer>();
	
	public static void stripperAdder(int x)
	{
		int index = digits.size();
		while(x != 0)
		{
			digits.add(index, x % 10);
			x/= 10;
		}
	}
	public static void main(String[] args)
	{
		digits.add(-1);
		digits.add(-1);
		for(int i = 1; i <= 1000000; i++)
		{
			stripperAdder(i);
		}
		
		int d1 = digits.get(1 + 2 - 1);
		int d10 = digits.get(10 + 2 - 1);
		int d100 = digits.get(100 + 2 - 1);
		int d1000 = digits.get(1000 + 2 - 1);
		int d10000 = digits.get(10000 + 2 - 1);
		int d100000 = digits.get(100000 + 2 - 1);
		int d1000000 = digits.get(1000000 + 2 - 1);
		
		System.out.println(d1 * d10 * d100 * d1000 * d10000 * d100000 * d1000000);
	}

}
