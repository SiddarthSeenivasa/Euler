import java.math.BigInteger;

public class p20 
{
	public static void main(String[] args)
	{
		BigInteger result = new BigInteger("1");
		for(int i = 100; i >= 1; i--)
		{
			String x = "" + i;
			result = result.multiply(new BigInteger(x));
		}
		
		String[] parts = result.toString().trim().split("");
		int sum = 0;
		
		for(String y : parts)
		{
			sum += Integer.parseInt(y);
		}
		
		System.out.println(sum);
	}

}
