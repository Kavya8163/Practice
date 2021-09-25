class Foo
{
//int a = 5;
void method()
{
System.out.println("SuperClass Method Call");
}
}
class BAr extends Foo
{
String a = "ramu";
void method(){
System.out.println(a);
//System.out.println(super.a);
System.out.println("Barmethod");
super.method();
}
}