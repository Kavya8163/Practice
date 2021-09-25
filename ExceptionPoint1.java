class ExceptionPoint1
{
static void fun(int a)
{
try
{
if(a==0)
throw new Exception(""+a);
if(a==1)
throw new Error(""+a);
}
catch(Exception e)
{
System.out.println("Caught "+e.getMessage());}
catch(Error e){
System.out.println("Caught "+e.getMessage());}
}
public static void main(String[] args)
fun(1);
fun(0);
}
}
