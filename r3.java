// swap 10 numbers
import java.util.*;
class r3
{
public static void main(String[] args)
{
int a[]=new int[10];
Scanner sc=new Scanner (System.in);
System.out.println("enter nmber");
for(int i=0;i<10;i++)
a[i]= sc.nextInt();
for(int i=0;i<10;i++)
{
for(int j=i+1; j<10;j++)
{
if (a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("sorted num");
for(int i=0;i<10;i++)
System.out.println(a[i] +"\t");
}
}
