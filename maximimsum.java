import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	//	System.out.println("Hello World");
	    Scanner sc= new Scanner(System.in);
		//System.out.println("enter the number of element");
		int n=sc.nextInt(),temp;
		//System.out.println("enter the number");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        for(int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
       int b=a[n-1]+a[n-2] ; 
        System.out.println(b); 
	}
}
