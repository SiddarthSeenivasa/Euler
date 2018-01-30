import java.util.*;
import java.io.*;

public class p42 
{
	public static ArrayList<String> words = new ArrayList<String>();
	
	public static ArrayList<String> Twords = new ArrayList<String>();
	
	public static ArrayList<Integer> Tnums = new ArrayList<Integer>();
	
	public static int tSum(String x)
	{
		String test = x.substring(1, x.length() - 1).toUpperCase();
		System.out.println(test);
		int sum = 0;
		
		for(int k = 0; k < test.length(); k++)
			sum += (test.charAt(k)) - 64;
		
		return sum;
		
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner x = new Scanner(new File("words.txt"));
		String[] data = x.nextLine().trim().split(",");
		for(String word : data)
			words.add(word);
		for(int i = 1; i < 1000000; i++)
			Tnums.add(new Integer((int)(0.5 * i * (i + 1))));
		for(String word : words)
		{
			Integer tSum = tSum(word);
			if(Tnums.contains(tSum))
				Twords.add(word);
		}
		
		System.out.println(Twords.size());
		
		
	}

}
