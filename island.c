#include<stdio.h>
#include<string.h>
int main()
{
    int a;
    int arr[5][5];
    int count=0;
    int i,j;
    scanf("%d",&a);
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=a;j++)
        {
            scanf("%d",&arr[i][j]);
        }
        printf("\n");
    }
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=a;j++)
        {
            if(arr[i][j]==1)
            {
                if(arr[i][j+1]==0&&arr[i+1][j]==0&&arr[i+1][j+1]==0)
                {
                    count=count+1;
                }
            }
        }
    }
        printf("%d",count);
return 0;
}
