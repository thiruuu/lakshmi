 import java.util.*;
class secondhigh {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
   

    Scanner sc=new Scanner(System.in);
  
    //System.out.println("hello world");
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    
    Arrays.sort(a);
    System.out.print(a[n-k]);
  }
}
