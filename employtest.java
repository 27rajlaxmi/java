import java.util.*;
class employ
{
String fn;
String lm;
double ms;

employ()
{
fn=" ";
lm=" ";
ms=0.0;
}
void get()
{
Scanner sc= new Scanner(System.in);
System.out.println("enter first name");
fn=sc.next();
System.out.println("enter last name");
lm=sc.next();
System.out.println("enter monthiy salary");
ms=sc.nextInt();
}
void set()
{
System.out.println("enter first name :"+fn);
System.out.println("enter last name :"+lm);
System.out.println("enter monthiy salary"+ms);
}
void cal()
{
double ys;
double i;
ys=ms*12;
i=(ms+(ms*10/100));
System.out.println("yearly salary is :"+ys);
System.out.println("after increment is:"+i);
}

}
class employtest
{
public static void main(String[] args)
{
employ e1=new employ();
employ e2=new employ();
e1.get();
e1.set();
e1.cal();
e2.get();
e2.set();
e2.set();
}
}
