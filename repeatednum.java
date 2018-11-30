import java.util.*;
public class repeatednum {
      public static void main(String aa[]){
            int n;
            int count=0;
            int v=0;
            int k=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();

            }
             Arrays.sort(a);
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                     System.out.printf("%d\t",a[i]);
                    }
                    
                }
       }
             
      }

}
