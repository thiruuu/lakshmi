import java.io.*;
import java.util.Scanner;
public class Anagram
{
    public static void main(String[]args)
    {
        Scanner data=new Scanner(System.in);
        String s1="shanmathi";
        char[] a=s1.toCharArray();
        char[] b =data.next().toCharArray();
        
        
        for(int i=0;i<=a.length;i++)
        {
            for(int j=0;j<=b.length;j++)
            {
                if(a[i]==b[j])
                System.out.print("yes");
            
            
            }
                
            
        }
        System.out.println("no");
    }
}
