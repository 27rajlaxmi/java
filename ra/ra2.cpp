#include<iostream>
using namespace std;
int main()
{
int r,a[10][10],trp[10][10],sum[10][10],i,j,c;
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
//transpose of matrix
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
trp[i][j]=a[j][i];
}
}
cout<<"transpose of two matrix is\n"<<trp[i][j];
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
cout<<"\t"<<trp[i][j];

}
cout<<"\n";
}
return 0;
}
