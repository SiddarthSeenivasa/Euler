import java.io.*;
import java.util.*;

public class p39 
{
	public static void main(String[] args)
	{
		int max = 0;
		
		for(int i = 0; i < 1000; i++)
			for(int k = 0; k < 1000; k++)
				for(int j = 0; j < 962; j++)
				{
					int a = (int) Math.pow(i, 2);
					int b = (int) Math.pow(k, 2);
					int c = (int) Math.pow(j, 2);
					if(j == (a + b))
					{
						int sum = i + k + j;
						if(sum > max)
							max = sum;
					}
				}
		System.out.println(max);
	}

}
