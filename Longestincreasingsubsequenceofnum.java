package arrays.java;

import java.util.Scanner;

public class Longestincreasingsubsequenceofnum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
	  // int[] b=new int[n];
		int[] lis=new int[n];
		int max=0,k=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			lis[i]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]<a[i] && lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
					//b[k++]=a[i];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			//System.out.print(b[i]+" ");
			if(max<lis[i])
			{
				max=lis[i];
			}
		}
		System.out.print(max);
		sc.close();
	}
}
