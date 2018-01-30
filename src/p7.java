import java.util.*;
import java.io.*;
public class p7 
{
	private static boolean isPrime(int x)
	{
		if(x < 2)
			return false;
		if(x == 2)
			return true;
		else if(x % 2 == 0)
			return false;
		for(int i = 2; i <= Math.sqrt(x); i++)
			if(x % i == 0)
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int count = 0;
		for(int i = 1; i < Integer.MAX_VALUE; i++)
		{
			if(count < 10001 && isPrime(i))
			{
				count++;
				primes.add(i);
			}
			else if(count >= 10001)
				break;
		}
		System.out.println(primes);
		System.out.println(primes.get(primes.size() - 1));
	}

}
