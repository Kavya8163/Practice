class ExceptionUsingThro
{
public static void fun(int a)
{
RuntimeException e = new RuntimeException("param-ve");
System.out.println("fun Begin");
if(a<0)
throw e;
System.out.println("Fun End");
}
public static void main(String[] args)
{
System.out.println("Main Begin");
fun(-1);

System.out.println("MainEnd");
}
}