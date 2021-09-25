class ExceptionDemo
{
public static void main(String[] args)
{
System.out.println("main begin--------------");
try
{
int a[] ={23,45};
System.out.println("hjhjdhgjhjg");
a[3]=1;
System.out.println("main end");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("runtime error");
}
}
}