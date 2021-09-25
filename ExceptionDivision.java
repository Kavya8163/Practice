class ExceptionDivision
{
static int divide(int a, int b)
{
RuntimeException e = new RuntimeException("division by zerop error");
if(b==0)
throw e;
return a/b;
}
public static void main(String[] args)
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ist num");
int a = sc.nextInt();
System.out.print("2nd num");
int b = sc.nextInt();
try{
int c =divide(a,b);
System.out.println("divval"+c);
}
catch(RuntimeException e)
{
System.out.println(e.getMessage());
}
}
}
