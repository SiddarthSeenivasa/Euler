import java.util.*;
import java.io.*;

public class p50 
{
	public static boolean isPrime(int x)
	{
		if(x < 2)
			return false;
		if(x == 2)
			return true;
		if(x % 2 == 0)
			return false;
		for(int i = 3; i * i <= x; i+=2)
			if(x % i == 0)
				return false;
		return true;
	}
	private static ArrayList<Integer> primes = new ArrayList<Integer>();
	private static ArrayList<Long> primesums = new ArrayList<Long>();
	public static void main(String[] args)
	{
		for(int i = 0; i <= 1000000; i++)
			if(isPrime(i))
				primes.add(i);
		long primesum = 0;
		
		for(int x : primes)
		{
			primesum += x;
			if(isPrime((int)primesum))
				primesums.add(primesum);		
		}
		
		System.out.println(primes);
		System.out.println(primesums);
	}
	

}
