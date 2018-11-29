class printsamenum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,k,i,j,b=0,i1,j1;
n=sc.nextInt();
k=sc.nextInt();
int a[][]=new int[n][k];
for(i=0;i<n;i++)
{
for(j=0;j<k;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<n;i++)
{
	for(j=0;j<k;j++)
	{
		inner:
		for(i1=i+1;i1<n;i1++)
		{
			for(j1=0;j1<k;j1++)
			{
				if(a[i1][j1]==a[i][j])
					System.out.print(a[i][j]+" ");
			}
			break;
		}
 
	}
}
}
 }
