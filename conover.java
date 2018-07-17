import java.util.*;
class box
{
double width;
double height;
double depth;
public box()
{

}
public box(box ob)
{
width=ob.width;
height=ob.height;
depth=ob.depth;

}
public box(double w, double h,double d)
{
width=w;
height=h;
depth=d;
}
public box(double len)
{
width=height=depth=len;
}

double volume()
{
return width*height*depth;
}
}
class conover
{
public static void main(String[] args)
{
box b1=new box();
box b2=new box(b1);
box b3=new box(12.3,34.4,23);
box b4=new box(11.3);
double v1=b1.volume();
//double v2=b2.volume();
//double v3=b3.volume();
//double v4=b4.volume();
System.out.println("volume is"+v1);
//System.out.println("volume is"+v2);
//System.out.println("volume is"+v3);
//System.out.println("volume is"+v4);
}
}

