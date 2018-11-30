
import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class subset {
     public static void main(String aa[]){
     int n;
     int l;
     int c=0;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     l=s.nextInt();
     int a[]=new int[n];
     int b[]=new int[l];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
     for(int i=0;i<l;i++){
        b[i]=s.nextInt();
    }
     for(int i=0;i<n;i++){
         for(int j=0;j<l;j++){
             if(a[i]==a[j]){
                 c=1;
                 break;
             }
         }
     }
     if(c==1){
         System.out.println("Yes");
     }
 else{
          System.out.println("No");
 }
    }
}
