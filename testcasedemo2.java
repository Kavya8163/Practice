class Point
{
int x;
int y;
}
public class testcasedemo2
{
static Point createobj(int a, int b)
{
Point p = new Point();
p.x=a;
p.y=b;
return p;
}
public static void main(String[] args)
{
Point p1 = createobj(2,3);
System.out.println(p1.x);
System.out.println(p1.y);
}
}
