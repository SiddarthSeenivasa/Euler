import java.util.*;
import java.io.*;
public class p5 
{
	private static boolean check(int x)
	{
		for(int i = 1; i < 21; i++)
			if(x % i != 0)
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		for(int i = 1; i < Integer.MAX_VALUE; i++)
			if(check(i))
				System.out.println(i);
	}

}
