import java.util.*;
import java.io.*;
public class p10 
{
	private static boolean isPrime(int n)
	{
		if(n < 2)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;
		for(int i = 3; i * i <= n; i+=2)
			if(n % i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		long sum = 0;
		for(int i = 0; i <= 2000000; i++)
			if(isPrime(i))
				sum += i;
		System.out.println(sum);
	}

}
