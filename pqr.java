import java.util.*;
import java.lang.*;
public class pqr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c[]=new int[a.length];
        int m=1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            m=m*a[i];
        }
        for(int i=0;i<c.length;i++)
        {
            c[i]=m/a[i];
            System.out.print(c[i]+" ");
}
