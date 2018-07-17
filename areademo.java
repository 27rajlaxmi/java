import java.util.*;
public interface Area
{
double pi=3.14;
double comput(double x, double y );
}
class rect implements Area
{
public double comput(double x,double y)
{
return x+y;
}
}


class tri implements Area
{
public double comput(double x,double y)
{
return x*y/2;
}
}


class circle implements Area
{
public double comput(double x,double y)
{
return pi* x*y;
}
}


class areademo
{
public static void main(String[] args)
{
Area A;
rect r= new rect();
tri t= new tri();
circle c= new circle();
A=r;
System.out.println("area is"+A.comput(10,20));
A=t;
System.out.println("area is"+A.comput(10,20));
A=c;
System.out.println("area is"+A.comput(10,20));
}}


