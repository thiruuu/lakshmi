
package subarray_product;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		int N,i,j,k,max=0,mul;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] array=new int[N];
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
		for(j=i;j<N;j++)
		{
			mul=1;
			for(k=i;k<=j;k++)
			{
				mul=mul*array[k];
			}
			if(mul>max)
			{
				max=mul;
			}
		}
		}
		System.out.println(max);

	}

}
