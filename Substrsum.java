
package sum_of_substring;

import java.util.Scanner;

public class Substrsum {

	public static void main(String[] args) {
	   int N,i,j,k,max=-1000,temp;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the size:");
	   N=sc.nextInt();
	   int[] array=new int[N];
	   System.out.println("enter the array elements:");
	   for(i=0;i<N;i++)
	   {
		   array[i]=sc.nextInt();
	   }
	   for(i=0;i<N;i++)
	   {
		   for(j=i;j<N;j++)
		   {
			   temp=0;
			   for(k=i;k<=j;k++)
			   {
				   temp=temp+array[k];
			   }
			   if(temp>max)
			   {
				   max=temp;
			   }
		   }
	   }
	   System.out.println(max);

	}

}
