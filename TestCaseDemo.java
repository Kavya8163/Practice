class Point{
int x;
int y;
}
public class TestCaseDemo{
static void testMethod(Point p)

{
System.out.println(p.x);
System.out.println(p.y);
p.x =1;
p.y=2;
}
public static void main(String[] args)
{
Point p1 = new Point();
p1.x=5;
p1.y=6;
testMethod(p1);
System.out.println(p1.x);
System.out.println(p1.y);
}
}













