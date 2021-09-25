class ExceptionCallingFun
{
static void fun3()
{
RuntimeException e = new RuntimeException("SillyExceptiin);
throw r;
}
static void fun2()
{
fun3();
System.out.println("fun3 is call");
}
static void fun1()
{
fun2();
System.out.println("fun2 is call");
}
public static void main(String[] args)
{
try
{
fun1();
System.out.println("fun1 is call");
}
catch(RuntimeException e)
{
e.printStackTrace();
}
}
}