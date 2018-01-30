import java.util.*;
import java.io.*;
public class p4 
{
	public static boolean isPalindrome(String tester)
	{
	   if(tester.length() <= 1)
	     return true;
	   else if(tester.charAt(0) == tester.charAt(tester.length()-1))
	     return isPalindrome(tester.substring(1, tester.length()-1));
		return false;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		for(int i = 100; i < 1000; i++)
			for(int k = 100; k < 1000; k++)
			{
				int prod = i * k;
				if(isPalindrome("" + prod))
					results.add(prod);
			}
		
		int max = 0;
		
		for(Integer x : results)
			if(max < x)
				max = x;
		System.out.println(max);
	}

}
