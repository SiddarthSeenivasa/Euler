import java.util.*;
import java.io.*;
public class p2 
{
	public static void main(String[] args)
	{
		int n1 = 1;
		int n2 = 1;
		int sum = 0;
		for(int i = 0; i < Integer.MAX_VALUE; i++)
		{
			if(n1 < 4000000)
			{
				int temp = n2;
				n2 += n1;
				n1 = temp;
				if(n2 % 2 == 0)
					sum += n2;
			}
			else
			{
				break;
			}
		}
		
		System.out.println(sum);
	}

}
