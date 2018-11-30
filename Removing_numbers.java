

import java.io.*;
import java.util.*;
public class Removing_numbers
{
static int l;
 public static void main(String args[])
 {
 int num,i;
 Scanner sc=new Scanner(System.in);
 num=sc.next();
 char str[]=num.toCharArray();
 int n=str.length;
 for(i=0;i<n;i++)
  {
   a[i]=Character.getNumericValue(str[i]);
  }
  int min=a[0];
  int ind=0;
  for(i=1;i<n;i++)
  {
   if(min>a[i])
   {
    min=a[i];
    ind=i;
   }
  }
//System.out.println("enter the number of numbers to be deleted");
int no=sc.nextInt();
int k=1,t1=0;
 while(k<=no)
  {

   int ma=a[0];
   int mad[t1]=0;
   for(int t=0;t<ind;t++)
   {
    l++;
    if(ma<a[t])
     {
      ma=a[t];
      mad[t1]=t;
     }
   }
    if(l!=t1)
    {
    break;
    }
    k++;
    t1++;
 }
if(no-k>0)
while(k<=n)
 {
  int ma1=a[ind+1];
  int maa1[t1]=ind+1;
  for(int h=ind+1;h<n;h++)
   {
   ma1=a[h];

   mad[t1]=h;

   }
 
 k++;
 t1++;
 }
int flag=0;
 for(int k2=0;k2<n;k2++)
 {
  for(int k3=0;k3<n;k3++)
  {
   if(mad[k2]==k3)
   {
    flag=1;
   }
  }
 if(flag==0)
 {
 System.out.println(a[k2]);
 }
 else
 {
 flag=1;
 }
 }

}

}
