import java.io.*;
import java.util.*;
public class p35 
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
	
	public static ArrayList<Long> RotateNumber(long number)

    {
			ArrayList<Long> data = new ArrayList<Long>();
          long start = number;



          int numdigits = (int) Math.log10((double)number);

          int multiplier = (int) Math.pow(10.0, (double)numdigits);      

          while(true)

          {

                long q = number / 10;

                long r = number % 10;

                number = number / 10;

                number = number + multiplier * r;



                data.add(number);

               

                if(number == start)

                      break;

          }

          return data;
    }
	
	
	public static void main(String[] args)
	{
		int count = 0;
		
		
		
		
		for(int i = 0; i < 1000000; i++)
		{
			if(isPrime(i))
			{
				boolean found = true;
				ArrayList<Long> data = RotateNumber(i);
				for(long x : data)
					if(!isPrime((int) x))
						found = false;
				if(found)
					count++;
			}
		}
		
		System.out.println(count);
	}

}
