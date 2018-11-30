import java.util.*;
import java.lang.*;
public class uniqnum {
     public static void main(String aa[]){
     char c;
     int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     ArrayList<Character>a=new ArrayList<Character>();
     for(int i=0;i<n;i++){
         c=s.next().charAt(0);
         a.add(c);
     }
     for(int i=0;i<n;i++){
         if(Collections.frequency(a, a.get(i))==1){
             System.out.print(a.get(i));
         }
     }

    }

}
