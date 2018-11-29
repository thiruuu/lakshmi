import java.util.*;

class Prefix{


     public static void main(String []args)
   {

         Scanner sc=new Scanner(System.in);

         int n=sc.nextInt();
 
        String arr[]=new String[n];
 
        for(int i=0;i<n;i++)
 
        {
 
            arr[i]=sc.next();

	//System.out.print(arr[i]);
         }

         String ans=commonPrefix(arr,n);
 
        if(ans.length()>0)
 
        {
 
            System.out.println(ans);

        }

         else

         {

             System.out.println("there is no common prefix");

         }

     }
 
    static String commonPrefix(String arr[], int n)
 
   {
 
        String prefix = arr[0]; 

  
        for (int i = 1; i < n ; i++)
 
        {
 
            prefix = commonPrefixUtil(prefix, arr[i]);
 
        } 
  
        
        return (prefix);
 
    } 

 static String commonPrefixUtil(String str1, String str2)
 {
 
        String result = "";
 
        int n1 = str1.length(), n2 = str2.length();
 
  
        // Compare str1 and str2  
       
 for (int i = 0, j = 0; i <n1  && j <n2; i++, j++)
 { 

            if (str1.charAt(i) != str2.charAt(j))
           {
 
                break;
 
          } 

            result += str1.charAt(i);
 
        }
 
  
        return (result); 

   } 

  
}
