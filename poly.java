class vechile
{
public void move()
{
System.out.println("vechile can move");
}
}
class motor extends vechile
{
public void move()
{
System.out.println("motor bike can move and acclerated");
}
}
class poly
{
public static void main(String [] args)
{
vechile vh=new vechile();
vh.move();
}
}