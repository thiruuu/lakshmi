
import java.util.*;
public class reversell {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		long a = sc.nextLong();
		int i = 0;
		long temp = a;
		temp = a;
		while(temp>0)
		{
			temp %= 10;
			a /=10;
			// System.out.println(temp);
			if(a<10)
			{
				System.out.print("->" + temp);
			}
			else
			{
				System.out.print(temp + "->");
			}
			
			temp = a;
			// System.out.println(temp);
		}
	}
}
