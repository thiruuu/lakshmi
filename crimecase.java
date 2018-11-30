
import java.util.Scanner;
public class crimecase 
{
 public static void main(String[] args) 
 {
     System.out.println("enter the input");
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
	int m=s.length();
	int j=0;
	int t,n,k;
		for(int i=0;i<m;i++){
		t=s.charAt(i)-'0';
		if(t==s.charAt(m-1)-'0')
{
			n=s.charAt(0)-'0';
	
			k=pow(t,n);
		}
		else{
	        n=s.charAt(i+1)-'0';
	        k=pow(t,n);
     }
      j=j+k;
     }
		System.out.println(j);
	 }
	 static  int pow(int t,int n)
   {
	    int total=1;
	    for(int i=1;i<=n;i++){
	        total*=t;
            }
            return total;
} 
}
