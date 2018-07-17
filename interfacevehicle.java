import java.util.*;
interface vehicle
{
static String name="ballerow";
static int mp=5;
static int ms=90;
//ms=maxspeed and mp=maxpassengers

}
interface land extends vehicle
{
static int nw=4;
public void drive();
//nw=number of wheels
}
interface sea extends vehicle
{
static int dis=1000;
public void launch();
//dis=displacement
}
class car implements land
{
public void drive()
{
System.out.println("name of car"+name);
System.out.println("limit of maxpasseanger"+mp);
System.out.println("no. of wheels"+nw);
System.out.println("max speed"+ms);
}
}
class ship implements sea
{
public void launch()
{

System.out.println("name of car"+name);
System.out.println("max displacement"+dis);
System.out.println("max speed"+ms);
}
}
class hovercraft implements land, sea
{
public void drive()
{
System.out.println("name of car"+name);
System.out.println("limit of maxpasseanger"+mp);
System.out.println("no. of wheels"+nw);
System.out.println("max speed"+ms);
}
public void launch()
{

System.out.println("name of car"+name);
System.out.println("max displacement"+dis);
System.out.println("max speed"+ms);
}
}
class interfacevehicle
{
public static void main(String[] args)
{
car c=new car();
System.out.println("information of car is");
c.drive();
ship s=new ship();
System.out.println(" info of ship is");
s.launch();
hovercraft h=new hovercraft();
System.out.println("info of hovercraft is");
h.drive();
h.launch();
}
}
