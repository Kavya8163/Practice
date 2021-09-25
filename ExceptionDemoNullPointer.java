import java.util.*;
class ExceptionDemoNullPointer
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter size:");
int size = sc.nextInt();
int a[] = null;
try
{
a = new int[size];
}
catch(NegativeArraySizeException u)
{
System.out.println("Caught"+u);
}
try
{
a[-1] =23;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Caught"+e);
}
catch(NullPointerException n)
{
System.out.println("Caught"+n);
}

}
}