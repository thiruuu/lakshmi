import java.util.*;
import java.lang.*;

public classs mincost
{	
	public static void main (String[] args) 
    {
		String X,Y;
		Scanner sn= new Scanner(System.in);
		X=sn.next();
		Y=sn.next();		
		int count=0;
		char[] arr1=X.toCharArray();
		char[] arr2=Y.toCharArray();
		int j=arr1.length-1;
		int k=arr2.length-1;
		if(k<j)
		{
			count+=k;
			k++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(i>j)
				count+=i;
			else if(arr2[i]!=arr1[i])
				count+=(arr2[i]-arr1[i]);						
		}
		System.out.println(count);

    }
}
