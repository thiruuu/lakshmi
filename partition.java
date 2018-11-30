package pro;
import java.util.*;
import java.lang.*;
public class partition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		N=N/2;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=0,y=a+b;
		if(N%y==0)
		{
			System.out.println("YES");
		}
	}
}
