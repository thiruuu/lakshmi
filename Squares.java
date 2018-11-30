
import java.util.Scanner;

public class Squares {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int index=0,count=0;
		  int[] array=new int[8];
		  for(index=0;index<8;index++)
		    array[index]=sc.nextInt();
		   Arrays.sort(array);
		   for(index=0;index<4;index++)
		   {
		       if((2*array[index])==(array[index+4]))
		       {
		         count++;
		       }
		   }
		   if(count==4)
		   {
		       System.out.print("yes");
		   }
		   else
		   {
		       System.out.print("no");
		   }
	}
}
