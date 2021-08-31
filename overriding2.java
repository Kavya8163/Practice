class Alpha
{
void fun1(){
System.out.println("fun1");
}
void fun2()
{
System.out.println("fun2");
}
}
class Beta extends Alpha{
void fun1()
{
}
void fun3(){
}
}
public class overriding2
{
public static void main(String[] args)
{
Alpha a = new Alpha();
a.fun1();
a.fun2();
}
}