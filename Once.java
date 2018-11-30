import java.util.*;
class onec{
    public static void main(String aa[]){
        Scanner s=new Scanner(System.in);
        String h=s.next();
        String j="";
        String j1="";
        char v[]=h.toCharArray();
        int y=h.length()/2;
        for(int i=0;i<y;i++){
            j=j+v[i];
        }
        if(h.length()%2==0){
        for(int i=y;i<h.length();i++){
            j1=j1+v[i];
        }
        }
        else{
          for(int i=y+1;i<h.length();i++){
            j1=j1+v[i];
        }  
        }
       
        if(j.equals(j1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
}
