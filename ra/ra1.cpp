#include<iostream>
using namespace std;
int main()
{
int r,a[10][10],b[10][10],sum[10][10],sub[10][10],i,j,c;
cout<<"enter number of rows";
cin>>r;
cout<<"enter number of col";
cin>>c;
cout<<"enter first matrix";
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{

cin>>a[i][j];
}
}
cout<<"ente 2 matrix";
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{

cin>>b[i][j];
}
}
//add two matrix
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
sum[i][j]=a[i][j]+b[i][j];
}
}
cout<<"sum of two matrix is"<<sum[i][j];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
cout<<"\t"<<sum[i][j];
}
cout<<"\n";

}
//subtraction
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
sub[i][j]=a[i][j]-b[i][j];
}
}
cout<<"sum of two matrix is"<<sub[i][j];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
cout<<"\t"<<sub[i][j];
}
cout<<"\n";
}

return 0;
}
