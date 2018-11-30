#include <stdio.h>
int main() 
{
   int n,k,i,j,a[10],flag=0;
   scanf("%d %d",&n,&k);
   for(i=0;i<n;i++)
   {
       scanf("%d ",&a[i]);
   }
   for(i=0;i<n;i++)
   {
       for(j=i+1;j<n;j++)
       {
           if((a[i]+a[j])==k)
           {
               printf("yes..%d and  %d sums up to give %d",a[i],a[j],k);
               flag=1;
               break;
           }
       }
   }
   if(flag!=1)
   {
       printf("no");
   }
	return 0;
}
