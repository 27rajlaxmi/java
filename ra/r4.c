#include<stdio.h>
void main()
{
int a,b,n;
printf("enter any  no.");
scanf("%d",&n);
while(n!=0)
{
a=n%10;
b=b*10+b;
n/=10;
}

printf(" %d",a);

};
