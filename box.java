import java.util.*;
class box
{
double width;
double height;
double depth;
}
class boxdemo
{
public static void main(String[] args)
{
box b1=new box();
b1.width=10.5;
b1.height=20;
b1.depth=30;
double vol= b1.width*b1.height*b1.depth;
System.out.println("volum is"+vol);
}

}//simple example of class

