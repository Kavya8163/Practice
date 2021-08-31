interface A{
void fun();
}
class Demo
{
public static void main(String[] args){
A a = new A()
{
public void fun()
{
System.out.println("fun meyhod");
}
};
a.fun();
System.out.println(a);

}
}
