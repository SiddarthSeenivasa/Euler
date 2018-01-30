
public class p31 
{
	public static void main(String[] args)
	{
		int count = 0;
		
		for(int i = 0; i <= 200; i++)
			for(int k = 0; k <= 100; k++)
				for(int j = 0; j <= 40; j++)
					for(int p = 0; p < 20; p++)
						for(int l = 0; l <= 10; l++)
							for(int t = 0; t <= 4; t++)
								for(int h = 0; h <= 2; h++)
									for(int s = 0; s <= 1; s++)
		if(((i * 1) + (k * 2) + (j * 5) + (p * 10) + (l * 20) + (t * 50) + (h * 100) + (s * 200)) == 200)
			count++;
		
		System.out.println(++count);
	}

}
