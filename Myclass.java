import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       //int cnt=0;
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       if(n%2==0)
       {
           System.out.println("no");
       }
       else
       {
           System.out.println("yes");
       }
    }
}
