import java.util.*;
import java.io.*;
public class p44 
{
	private static ArrayList<Integer> pentagonals = new ArrayList<Integer>();
	
	private static int penta(int x)
	{
		return ((x * ((3 * x) - 1)) / 2);
	}
	
	public static void main(String[] args)
	{
		int max = 10000;
		while(max-- > 1)
			pentagonals.add(0, penta(max));
		
		for(int k = 0; k < pentagonals.size(); k++)
			for(int i = 0; i < pentagonals.size(); i++)
			{
				int sum = pentagonals.get(k) + pentagonals.get(i);
				int difference = Math.abs(pentagonals.get(k) - pentagonals.get(i));
				if(pentagonals.contains(sum) && pentagonals.contains(difference))
					System.out.println(difference);
			}
	}

}
