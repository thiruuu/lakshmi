package mypackage;
import java.util.Scanner;
public class StringDiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        String str1=sc.next();
        String str2=sc.next();
        
        int len1=str1.length();
        int len2=str2.length();
        
        int count=0;
        
        if(len1<=len2)
        {
            String temp=str1;
            str1=str2;
            str2=temp;
            len1=str1.length();
            len2=str2.length();
        }
        
        for(int i=1;i<=len2;i++)
        {
            if(len1%i==0 && len2%i==0)
            {
                if(isACommonDivisor(str1,str2,str1.substring(0,i)))
                {
                    count++;
                }
            }
        }
        System.out.println("Output :\n" + count);
    }
    private static boolean isACommonDivisor(String str1,String str2,String substr)
    {
        int len1=str1.length();
    	int len2=str2.length();
    	int len=substr.length();
    	
        int i,j;
        for(i=0;i<len2;i+=len)
        {
            if(!str1.substring(i,i+len).equals(substr) || !str2.substring(i,i+len).equals(substr))
                return false;
        }
        for(j=i;j<len1;j+=len)
        {
            if(!str1.substring(j,j+len).equals(substr))
                return false;
        }
        return true;
    }
}
