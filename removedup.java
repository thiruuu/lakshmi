
package remove_duplicate_char;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removedup {

	public static void main(String[] args) {
		String S;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		char[] array=S.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		for(char ch:array)
		{
			charSet.add(ch);
		}
		StringBuilder sb=new StringBuilder();
		for(char c:charSet)
		{
			sb.append(c);
		}
		System.out.println(sb.toString());
	}

}
