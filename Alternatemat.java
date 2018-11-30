
import java.util.*;
import java.lang.*;
import java.io.*;
public class Alternatemat{

     public static void main(String []args){
         int N,M,i,j,k,l,m,n;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         M=in.nextInt();
         int[][] a=new int[N][M];
         int c[]=new int[100];
         int d[]=new int[100];
         for(i=0;i<N;i++)
         {
             for(j=0;j<M;j++)
             {
                 a[i][j]=in.nextInt();
             }
         }int count=0;
         for(i=0;i<N;i++)
         {
             
             for(j=0;j<M;j++)
             {
                 if(a[i][j]==0)
                 {
                     for(m=0,n=0;m<N&&n<M;m++,n++)
                     {
                         count++;
                         c[m]=i;
                         d[n]=j;
                     }
                 }
                
             }
         }
         
        
         for(m=0,n=0;m<count-1&&n<count-1;m++,n++)
         {
             
             for(i=0;i<N;i++)
             {
                 for(j=0;j<M;j++)
                 {
                     if(i==c[m]&&j==d[n])
                     {
                         
                      for(k=0;k<M;k++)
                     {
                         a[i][k]=0;
                     }
                     for(l=0;l<N;l++)
                     {
                         a[l][j]=0;
                     }   
                     }
                 }
             }
         }
         for(i=0;i<N;i++)
         {
             for(j=0;j<M;j++)
             {
        System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }
     }
}
