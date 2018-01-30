import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class p25 
{
	private static ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
	
	private static BigInteger fibb(BigInteger x)
	{
		if(x.compareTo(new BigInteger("3")) < 0)
			return new BigInteger("1");
		return fibb(x.subtract(new BigInteger("1"))).add(fibb(x.subtract(new BigInteger("2"))));
	}
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++)
		{
			nums.add(fibb(new BigInteger("" + i)));
		}
		
		System.out.println(nums.get(12));
	}
}
