class Alpha{
final int a;
Alpha(int x)
{
a=x;
}
}
public class finalnonstaticdatamember2
{
public static void main(String[] args)
{
Alpha r = new Alpha(6);
System.out.println(r.a);
r.a =7;
Alpha r2 = new Alpha(7);
System.out.println(r2.a);
r2.a= 8;
}
}

