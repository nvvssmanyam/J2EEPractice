package test;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryQueries
{
	static int[] array;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc .nextInt();
		int Q = sc.nextInt();
		array = new int[N];
		for(int i=0; i<N; i++)
			array[i] = sc.nextInt();
		
	sc.nextLine();
		
		String[] queries = new String[Q];
		for(int i=0; i<Q; i++) {
			queries[i] = sc.nextLine();
			System.out.println(Arrays.toString(queries));
		}
		
		System.out.println(Arrays.toString(queries));
		
		output(queries);
		sc.close();
	}
	
	static void output(String[] queries)
	{
		for(int i=0; i<queries.length; i++)
		{
			if(queries[i].charAt(0)=='0')
			{
				int L = queries[i].charAt(2);
				int R = queries[i].charAt(4);
				printEvenOrOdd(L-1,R-1);
			}
			else if(queries[i].charAt(0)=='1')
			{
				int X = queries[i].charAt(2);
				if(X>0)
					flip(X-1);
			}
		}
	}
	
	static void printEvenOrOdd(int L, int R)
	{
		String s =null;
		for(int i=L; i<=R; i++)
			s+=array[i];
		int decimal=Integer.parseInt(s,2);
		if(decimal%2==0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
	}
	
	static void flip(int x)
	{
		int n = array[x];
		if(n==0)
			array[x] = 1;
		else
			array[x] = 0;
	}

}
