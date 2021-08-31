class Circle
{
int radius;
}
public class NonStaticDemo2
{
public static void main(String[]args)
{
System.out.println("main begin");
Circle c = null;
System.out.println("ref Creating pointing null");
c.radius = 5;
System.out.println("nextline Afterline Sg");
System.out.println(c.radius);
System.out.println("main end");
}
}