class ExceptionDemo2
{
public static void main(String[] args)
{
System.out.println("main begin");
try
{
Class.forName("123");
}
catch(ClassNotFoundException e)
{
System.out.println("123 class is not there");
}
System.out.println("main end");
}
}

