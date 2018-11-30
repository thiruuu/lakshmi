
import java.io.*;
import java.util.*;
public class Pangram
{
 static int p;
 public static void main(String arg[])
 { 
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   StringBuilder str1=str.toLowerCase();
  for(char i='a';i<='z';i++)
    {
      if(str1.indexOf(i)<0)
      { 
        p=1;
      }
    }
  if(p==0)
  {
    System.out.println("yes");
   }
  else
  {
   System.out.println("no");
   }
 }
}   
