
import java.io.*;
import java.util.*;
import java.lang.*;
public class quasi_palindromic
{
 public static void main(String args[])
 {
   StringBuilder s=new StringBuilder(" ");
   Scanner sc=new Scanner(System.in); 
   String str=sc.next();
  
   int no=sc.nextInt();
   for(int i=0;i<no;i++)
    {
       s.append("0");
     }
    
     s.append(str);
    StringBuilder str2=new StringBuilder(str);
     str2.reverse();
    String final1=new String(s);
    String final2=new String(str2);
   if(final1.equals(final2))
   {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }
 }
}
