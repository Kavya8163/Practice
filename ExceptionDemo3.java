import java.util.*;
class ExceptionDemo3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter size:");
int size = sc.nextInt();
int a[] = new int[size];
a[-1] =23;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Caught"+e);
}
catch(NegativeArraySizeException a)
{
System.out.println("Caught"+a);
}
}
}