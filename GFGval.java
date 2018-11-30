import java.util.*;

class GFGval {
	public static void main (String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int c=2*n;
	    int count=0;
	    for(int i=0,j=1;i<c && j<c;i+=2,j+=2)
	    {
	        //System.out.println(i+" "+j);
	        count++;
	    }
		System.out.println(count);
	}
}
