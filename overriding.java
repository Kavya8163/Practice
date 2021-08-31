class Alpha{
void fun()
{
System.out.println("Alpha fun");
}
}
class Beta extends Alpha
{
void fun()
{
System.out.println("Beta fun");
}
}
public class overriding
{
public static void main(String[] args)
{
Alpha a = new Alpha();
a.fun();
Alpha b = new Beta();
b.fun();

}
}