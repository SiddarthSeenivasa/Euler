import java.util.*;
import java.io.*;

public class p36
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
		long sum = 0;
		
		for(int i = 1; i < 1000000; i++)
		{
			String base10 = "" + i;
			String base2 = Integer.toBinaryString(i);
			if(isPalindrome(base10) && isPalindrome(base2))
				sum += i;
		}
		
		System.out.println(sum);
	}

}
