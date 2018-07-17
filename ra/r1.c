#include<stdio.h>
void main()
{
int a,b;
printf("enter any 2 no.:");
scanf("%d%d",&a,&b);
a=a+b;
b=a-b;
a=a-b;
printf("swap value is %d and %d",a ,b);

};
