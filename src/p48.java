import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class p48 
{
	public static void main(String[] args)
	{
		BigInteger sum = new BigInteger("0");
		for(int i = 1; i <= 1000; i++)
		{
			BigInteger powSum = new BigInteger("" + i);
			powSum = powSum.pow(i);
			sum = sum.add(powSum);
		}
		
		System.out.println(sum);
		
		
		
	}

}
