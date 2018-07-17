import java.util.*;
class box
{
double width;
double height;
double depth;
double volume()

{
return width*height*depth;
}
void setDim(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
}
class box1
{
public static void main(String[] args)
{
box b1=new box();
b1.setDim(19.6, 24,43);
double volume=b1.volume();
System.out.println("volume ="+ volume);

}
}//

