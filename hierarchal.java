import java.io.*;
class car
{
void print()
{
System.out.println("car models");
}
}
class b extends car
{
void print1()
{
System.out.println("swift120");
}
}
class c extends car
{
void print2()
{
System.out.println("bmw");
}
}
class d extends car
{
void print3()
{
System.out.println("maruthi");
}
}
class hierarchal
{
public static void main(String[]args)
{
car n=new car();
b n1=new b();
n1.print();
n1.print1();
c n2=new c();
n2.print();
n2.print2();
d n3 =new d();
n3.print();
n3.print3();

}
}