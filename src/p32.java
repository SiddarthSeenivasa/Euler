import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class p32 
{
	public static void main(String[] args)
	{
		ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
		for(int i = 1; i < 10000; i++)
			for(int k = 1; k < 100000; k++)
			{
				char[] data = {'1' , '2', '3', '4', '5', '6', '7', '8', '9'};
				int pro = i * k;
				String result = "" + i + k + pro;
				for(char x : result.toCharArray())
					if(x == data[0])
						data[0] = 'x';
					else if(x == data[1])
						data[1] = 'x';
					else if(x == data[2])
						data[2] = 'x';
					else if(x == data[3])
						data[3] = 'x';
					else if(x == data[4])
						data[4] = 'x';
					else if(x == data[5])
						data[5] = 'x';
					else if(x == data[6])
						data[6] = 'x';
					else if(x == data[7])
						data[7] = 'x';
					else if(x == data[8])
						data[8] = 'x';
				int count = 0;
				for(char x : data)
					if(x == 'x')
						count++;
				if(count == 9 && !nums.contains(new BigInteger("" + pro)))
					nums.add(new BigInteger("" + pro));
			}
		
		BigInteger x = new BigInteger("0");
		for(BigInteger y : nums)
			x = x.add(y);
		
		System.out.println(x);
		
	}

}
