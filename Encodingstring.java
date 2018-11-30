 import java.util.Scanner;
public class Encodingstring {
    static final String ALPHABETS="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String string1=sc.next();
        String string2=sc.next();
        
        if(!string1.matches(".*\\d+.*") && !string2.matches(".*\\d+.*"))
        {
            if(string1.length()==string2.length())
                System.out.println("Output :\n" + encode(string1,string2));
            else
                System.out.println("Please enter strings of equal length");
        }
        else
        {
            System.out.println("String cannot have numbers");
        }
    }
    private static String encode(String string1,String string2)
    {
        String encodedString=new String();
        int index;
        for(int i=0;i<string1.length();i++)
        {
            index=((ALPHABETS.indexOf(string1.charAt(i))+1) + (ALPHABETS.indexOf(string2.charAt(i))+1))%26 - 1;
            index=(index<0)?26+index:index;
            encodedString+=ALPHABETS.charAt(index);
        }
        return encodedString;
    }
}
