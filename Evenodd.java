import java.util.*;
class Evenodd {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  
   if(n%2==0 && n>=0)
   {
     System.out.println("Even");
   }
   else if(n%2==1 && n>=0)
   {
     System.out.println("Odd");
   }
   else
   {
     System.out.println("Invalid");
   }
   }
   // System.out.println("Hello world!");
  
}
