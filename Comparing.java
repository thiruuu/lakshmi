
import java.util.*;

class Comparing {
	public static void main (String[] args) {
	    String temp="";
	    Boolean flag=false;
		Scanner sc=new Scanner(System.in);
	    String ip1=sc.nextLine();
	    String ip2=sc.nextLine();
	    int len1=ip1.length();
	    int len2=ip2.length();
	    for(int index=0;index<len1;index++)
	    { for(int index2=index+2;index2<len1;index2++)
	        {
	        String sample=ip2.replaceAll(ip1.substring(index,index2),"");
	         if(!(sample.equals(ip2)))
	         {
	             flag=true;
	             break;
	         }
	        }
	        if(flag==true)
	           break;
	    }
		if(flag==true)
		{
		    System.out.println("yes");
		}else
		{
		    System.out.println("No");
		}
	}
}
