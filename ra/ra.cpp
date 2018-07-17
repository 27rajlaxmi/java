#include<iostream>
using namespace std;
int main()
{
int n, rev ,rem;
cout<<""enter no.";
cin>>n;
while(n!=0)
rem=n%10;
rev=rev*16+rem;
n%=10;
rev num:<<rev;
cout<<" revers is";
return 0;
}
