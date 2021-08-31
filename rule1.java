class Alpha{
void fun(int a,int b)
{
System.out.println("int a and b");
}
}
class Beta extends Alpha{
void fun(double x,double y)
{
System.out.println("double x and double y");
}
}
public class rule1
{
public static void main(String[] args)
{
Beta a = new Beta();
a.fun(2.3,4.5);
}
}
