package javastrings.java;
import java.util.Scanner;

public class longestsubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		int x=0;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(0)<s.charAt(i))
			{
				x=i;
				break;
			}
		}
		if(x==0)
		{
			System.out.print("lexicographic substring is absent");
		}
		else
		{
			for(int i=x;i<n;i++)
			{
				System.out.print(s.charAt(i));
			}
		}
		sc.close();

	}

}
