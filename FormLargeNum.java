
package info.gv;
import java.util.*;
public class FormLargeNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}
}
