import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class p22 
{
	
	private static ArrayList<String> names = new ArrayList<String>();
	
	private static int nameSum(String x, int index)
	{
		String tester = x;
		tester = x.substring(1, tester.length() - 1);
		int sum = 0;
		for(int k = 0; k < tester.length(); k++)
		{
			sum += tester.charAt(k) - 64;
		}
		
		return sum * index;
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner kb = new Scanner(new File("p22.in"));
		String[] parts = kb.nextLine().split(",");
		for(String x : parts)
			names.add(x);
		
		BigInteger x = new BigInteger("0");
		
		Collections.sort(names);
		
		for(int i = 0; i < names.size(); i++)
		{
			 x = x.add(new BigInteger("" + nameSum(names.get(i), i + 1)));
		}
		
		System.out.println(x);
		
	}

}
