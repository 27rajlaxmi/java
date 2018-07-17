class box
{
double wid;
double heig;
double dep;
box()

{
wid=10.5;
heig=20;
dep=30;
}
double volume()
{
return wid*heig*dep;
}
}
class box2
{
public static void main(String [] args)
{
box b1=new box();
box b2=new box();
double volume=b1.volume();
System.out.println("volume"+volume);
}
}//constructor

