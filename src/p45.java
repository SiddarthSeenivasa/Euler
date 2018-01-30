import java.util.*;
import java.io.*;

public class p45 
{
	private static ArrayList<Integer> trinums = new ArrayList<Integer>();
	private static ArrayList<Integer> pentanums = new ArrayList<Integer>();
	private static ArrayList<Integer> hexanums = new ArrayList<Integer>();
	
	private static int penta(int x)
	{
		return (x * ((3 * x) - 1)) / 2;
	}
	
	private static int tri(int x)
	{
		return (x * (x + 1)) / 2;
	}
	
	private static int hexa(int x)
	{
		return (x * ((2 * x) - 1));
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 10000000; i++)
		{
			trinums.add(tri(i));
			pentanums.add(penta(i));
			hexanums.add(hexa(i));
		}
		for(int i = 1; i < 100000000; i++)
		{
			if(pentanums.contains(tri(i)) && hexanums.contains(tri(i)))
				System.out.println(tri(i));
		}
		
	}

}
