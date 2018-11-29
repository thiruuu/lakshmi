#include<stdio.h>
#include<stdlib.h>
 
void swap(char *a,char *b);
void permutation(char*,int,int);
int factorial(int l);
void main()
{   int l,p;
    char s[100000];
    gets(s);
   l=strlen(s);
   permutation(s,0,l-1);
 
 
}
void permutation(char *s,int l,int r)
{int i;
    if(l==r)
        printf("%s\n",s);
    else{
        for(i=l;i<=r;i++)
        {
            swap(s+l,s+i);
            permutation(s,l+1,r);
            swap(s+l,s+i);
        }
    }
}
void swap(char *a,char *b)
{
    char temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
