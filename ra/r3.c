#include<stdio.h>
void main()
{
int a,b,c,d,n;
printf("enter any  no.");
scanf("%d",&n);
a=n%10;
printf(" %d",a);
b=n/10;
//printf("%d",b);
c=b%10;
printf(" %d",c);
d=b/10;
printf(" %d",d);
};
