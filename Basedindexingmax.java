
import java.util.Scanner;

public class Basedindexing 
{
		public static int indexing(int u,int v,int[] a)
		{
			int min=999;
			for(int i=u-1;i<v;i++)
			{
			    if(min>a[i])
			    {
			        min=a[i];
			    }
			}
			return min;
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int q=sc.nextInt();
			int a[]=new int[n];
			int u=0,v=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<q;i++)
			{
				u=sc.nextInt();
				v=sc.nextInt();
				System.out.println(indexing(u,v,a));
			}
			sc.close();
		}
}
