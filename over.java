import java.util.*;
class student
{
int rn=12;
String name="DYP";
void display(int rn)
{
System.out.println("rn");

}
void display(String nm)
{
System.out.println("nm");

}

void display(int rn, String nm)
{
System.out.println(rn+"\t"+nm);

}
String display()
{
return name;

}
}
class over
{
public static void main(String[] args)
{
student s=new student();

s.display(11);
s.display("rajlaxmi");
s.display(11, "rajlaxmi");
String s1=s.display();


}
}
