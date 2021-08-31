public class ArrayDemo
{
static void fun(int a[])
{
a[0] = 1;
a[1] = 2;
a[2] = 3;
}
public static void main(String[] args)
{
int b[] = new int[3];
b[0] = 5;
b[1] = 6;
b[2] = 7;
System.out.println(b[0]+","+b[1]+","+b[2]);
fun(b);

System.out.println(b[0]+","+b[1]+","+b[2]);
}
}
