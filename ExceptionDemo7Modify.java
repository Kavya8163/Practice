class ExceptionDemo7
{
public static void fun(int a)
{
RuntimeException e=new RuntimeExcepton("Param is -ve");
System.out.println("Fun begin");
if(a<0)
throw e;
System.out.println("fun end");
}
public static void main(String[] args)
{
System.out.println("main begin");
try
{
fun(0);
fun(-1);}
catch(RuntimeException e)
{
System.out.println("Caught"+e);
}
System.out.println("main end");
}
}