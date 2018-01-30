import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class p29 
{
	public static void main(String[] args)
	{
		ArrayList<BigInteger> data = new ArrayList<BigInteger>();
		BigInteger x;
		BigInteger y;
		
		for(x = new BigInteger("2"); x.compareTo(new BigInteger("100")) <= 0; x.add(new BigInteger("1")))
			for(y = new BigInteger("2"); y.compareTo(new BigInteger("100")) <= 0; y.add(new BigInteger("1")))
				if(data.indexOf(x.pow(y.intValue())) == -1)
						data.add(x.pow(y.intValue()));
		System.out.println(data.size());
						
	}

}
