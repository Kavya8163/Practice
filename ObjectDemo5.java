class Studenttt
 {
int rollnum;
String name;
}
public class ObjectDemo5{
public static void main(String[] args)
{
Studenttt s1 = new Studenttt();
Studenttt s2 = new Studenttt();
System.out.println(s1);
System.out.println(s2);
System.out.println(s1==s2);
s2=s1;
System.out.println(s1);
System.out.println(s2);
System.out.println(s1==s2);
}
}