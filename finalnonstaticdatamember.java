class Alpha{
final int a=5;
}
public class finalnonstaticdatamember{
public static void main(String[] args)
{
Alpha al = new Alpha();
System.out.println(al.a);
al.a=6;
}
}