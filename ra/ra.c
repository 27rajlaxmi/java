#include<stdio.h>
void main()
{
int a,b,c;
printf("enter any three no.");
scanf("%d%d%d",&a,&b,&c);
if(a>b && a>c)
{
printf("%d is greater than b and c:\n", a );
}
else if(b>a && b>c)
{
printf("%d is greater than a and c", b);
}
else
{
printf("%d is greater than a and b",c);
}

};
