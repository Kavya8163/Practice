class finalparameter{
static void fun(final int a,int b)
{
a = a+1;
b=b+1;
System.out.println(a);
System.out.println(b);
}
public static void main(String[] args)
{
fun(5,6);
fun(4,5);
}
}