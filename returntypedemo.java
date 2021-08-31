class Point{
int x;
int y;
}
class Circle
{
int radius;
}
public class returntypedemo
{
static int getSum(int a,int b)
{
int c = a+b;
return c;
}
static Point getPointObj(int a, int b)
{
Point p  = new Point();
p.x = a;
p.y = b;
return p;
}
static Circle getCircleobj(int a)
{
Circle c = new Circle();
c.radius = 3;
return c;
}
public static void main(String[] args)
{

Circle c1,c2;
Point p1 = getPointObj(2,3);
Point p2 = getPointObj(4,5);
System.out.println(p1.x + "," +p1.y);
System.out.println(p2.x + "," +p2.y);
c1 = getCircleobj(4);
c2 = getCircleobj(5);
System.out.println(c1.radius);
System.out.println(c2.radius);
int z = getSum(23,55);
System.out.println(z);
}
}
                                                                                                                                                                                 

 