import java.util.*;
class lengthifsubstr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] a=new int[s.length()];
        String[] z=new String[s.length()];
        char[] c=s.toCharArray();
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            temp=(String.valueOf(c[i]));
            z[i]=temp;
            a[i]=temp.length();
            for(int j=i+1;j<s.length();j++)
            {
                if(temp.contains(String.valueOf(c[j])))
                {
                    z[i]=temp;
                    a[i]=temp.length();
                    break;
                }
                else
                {
                    temp=temp+(String.valueOf(c[j]));
                    z[i]=temp;
                    a[i]=temp.length();
                }
            }
            temp="";
        }
        Arrays.sort(a);
        int max=a[a.length-1];
                System.out.println(max);
    }
}
