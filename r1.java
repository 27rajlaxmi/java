import java.util.*;
class r1
{
public static void main(String[] args)
{
boolean flag=false;
int  num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
for(int i=2;i<num;i++)

{
if((num%i)==0)
{
flag=true;
break;
}
}
if(flag)
{
System.out.println("not a prime number");
}
else
{
System.out.println("is a prime number");
}
}//end
}
