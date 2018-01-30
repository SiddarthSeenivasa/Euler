import java.util.*;
import java.io.*;

public class p38 
{
	private static String pan(int x)
	{
		String result = "";
		int count = 1;
		while(result.length() < 9)
		{
			result += "" + (x * count++);
		}
		
		if(result.length() == 9)
			return result;
		else
			return "";
	}
	public static void main(String[] args)
	{
		long longest = 918273645;
		for(int i = 193; i < 200000000; i++)
		{
			String test = pan(i);
			if(test.length() == 0)
				continue;
			else if(test.matches("[123456789]"))
			{
				if(Integer.parseInt(test) > longest)
					longest = (long) Integer.parseInt(test);
			}
		}
		
		System.out.println(longest);
	}

}
