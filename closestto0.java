import java.io.*;
import java.util.*;
public class SumAlmostZero
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int sum=0;
String str=scan.nextLine();
int arr[]=new int[str.length()];
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
arr[i]=Integer.parseInt(String.valueOf(ch[i]));
}
Arrays.sort(arr);
sum=arr[0]+arr[1];
}
}
