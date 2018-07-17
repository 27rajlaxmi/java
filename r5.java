import java.util.*;
class r5
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int i, fact=1;
int num; 
System.out.println("enter any  number");
num=sc.nextInt();
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("factor is"+ fact);
}
}
// factorial
