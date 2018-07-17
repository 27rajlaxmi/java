import java.util.*;
class box
{
double wid;
double heig;
double dep;
public box()

{
wid=0;
heig=0;
dep=0;
}
double volume()
{
return wid*heig*dep;
}
}
class box3
{
public static void main(String [] args)
{
box b1=new box();
double volume=b1.volume();
System.out.println("volume"+volume);
}
}//default constructro
