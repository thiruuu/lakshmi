import java.util.Scanner;
class nearest
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,j=0,k,t,diff=0,count=0;
//System.out.println("ENTER THE TOTAL NO.OF.ARRAY ELEMENTS");
n=in.nextInt();
int a[]=new int[n];
int b[]=new int[n];
//System.out.println("ENTER THE ARRAY ELEMENTS");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
//System.out.println("ENTER THE K VALUE TO FIND THE  NEIGHBOUR VALUE FOR K IN THE ARRAY:");
k=in.nextInt();
for(i=0;i<n;i++)
{
diff=k-a[i];
 
if((k!=a[i])&&(k>Math.abs(diff)))
{
b[j]=a[i];
j++;
count++;
if(count==3)
break;
}
}
//System.out.println(" THE NEAREST NEIGHBOUR VALUE FOR K IN THE ARRAY ARE:");
 
for(j=0;j<count;j++)
{
	System.out.print(b[j]+" ");
}
}}
