import java.util.*;
import java.io.*;
public class p9 
{	
	public static void main(String[] args)
	{
		boolean found = false;
		for(int i = 1; i < 100000; i++)
			for(int k = 1; k < 100000; k++)
				for(int j = 1; j < 100000; j++)
					if(!found)
						if(Math.pow(i, 2) + Math.pow(k, 2) == Math.pow(j, 2))
							if(i + k + j == 1000)
							{
								System.out.println(i * k * j);
								found = true;
								break;
							}
	}
}
