#include<stdio.h>
int main()
{
	int s,n1,n2,k=0,temp,i,j;
	scanf("%d%d",&n1,&n2);
	for(i=n1;i<n2;i++)
	{
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				k=k+1;
			}
			if(k==1)
			{
				while(i!=0)
				{
					temp=i%2;
					printf("%d",temp);
					s=i/2;
					i=s/2;
			}
		}
	}
}
return 0;
}
