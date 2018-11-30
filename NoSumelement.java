
import java.util.Scanner;

public class NoSumelement {

	public static void main(String[] args) {
		int N,K,i,j,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size and number:");
		N=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
		System.out.println("enter the array elements:");
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
			for(j=i+1;j<N;j++)
			{
				if(array[i]+array[j]==K)
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
