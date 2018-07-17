#include<stdio.h>
void main()
{
int i,n;
int fact=1;
printf("enter any number");
scanf("%d",&n);
for(i=0;i<=n;i++)
{
fact= fact *i;
}
printf("the fact is %d", fact);

};
