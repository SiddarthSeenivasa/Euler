import java.io.*;
import java.util.*;

public class p8 
{
	private static int[][] nums;
	public static void main(String[] args) throws IOException
	{
		Scanner kb = new Scanner(new File("p8.in"));
		int rows = Integer.parseInt(kb.next().trim());
		int columns = Integer.parseInt(kb.nextLine().trim());
		nums = new int[rows][columns];
		while(kb.hasNext())
		
		System.out.println(Arrays.deepToString(nums));
	}
	

}
