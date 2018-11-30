
package SkillRack;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Descendingorder
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	LinkedList<Integer>l=new LinkedList<Integer>();
	for(int l=0;l<n;l++)
	{
		l.add(sc.nextInt());
	}
	l.sort(null);
	Iterator itr=l.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
