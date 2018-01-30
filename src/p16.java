import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class p16 
{
	public static void main(String[] args)
	{
		int sum = 0;
		BigInteger x = new BigInteger("2");
		String[] parts = x.pow(1000).toString().split("");
		for(String y : parts)
			sum += Integer.parseInt(y);
		System.out.println(sum);
	}
}
