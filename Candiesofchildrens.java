
package sample;

import java.util.Scanner;

public class Candiesofchildrens {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int t=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int count=n;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				for(int j=i;j<n-1;j++)
				{
					count++;
				}
			}
		}
		System.out.print(count);
		sc.close();
	}
}
