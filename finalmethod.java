class Alpha{
final void task(){
System.out.println("Alpha task");
}
}
class Beta extends Alpha{
void task()
{
System.out.println("Beta task");
}
}
class finalmethod
{
public static void main(String[] args)
{
Alpha a = new Alpha();
a.task();
Alpha a2 = new Beta();
a2.task();
}
}