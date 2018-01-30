import java.util.*;
import java.io.*;
public class p6 
{
	private static int squareSum()
	{
		int sum = 0;
		
		for(int i = 1; i < 101; i++)
		{
			int result = (int) Math.pow(i, 2);
			sum += result;
		}
		
		return sum;
	}
	
	private static int sumSquare()
	{
		int sum = 0;
		for(int i = 1; i < 101; i++)
			sum += i;
		
		return (int) Math.pow(sum, 2);
	}
	public static void main(String[] args)
	{
		System.out.println(Math.abs(squareSum() - sumSquare()));
	}

}
