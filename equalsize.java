import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class equalsize
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=0,m=0;
		int a[]=new int[n];
		String str="";
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			k=k+a[i];
			m=0;
			for(int j=i+1;j<n;j++)
			{
				m=m+a[j];
			}
			if(k/(i+1)==m/(n-(i+1)))
			{
				str="yes";
				break;
			}
			else
			{
				str="no";
			}
		}
		System.out.print(str);
	}
