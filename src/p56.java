import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class p56 
{
	private static ArrayList<BigInteger> digitStripper(BigInteger x)
	{
		ArrayList<BigInteger> result = new ArrayList<BigInteger>();
		while(!x.equals("0"))
		{
			
			result.add(x.mod(new BigInteger("10")));
			x = x.divide(new BigInteger("10"));
		}
		
		return result;
	}
	public static void main(String[] args)
	{
		
		BigInteger bigSum = new BigInteger("0");
		for(int i = 0; i < 100; i++)
			for(int k = 0; k < 100; k++)
			{
				ArrayList<BigInteger> digits = digitStripper(new BigInteger("" + i).pow(k));
				for(BigInteger x : digits)
					bigSum = bigSum.add(x);
			}
		
		System.out.println(bigSum);
	}

}
