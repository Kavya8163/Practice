class Student
{
int id;
String name;
}
public class copyingReference
{
public static void main(String[] args)
{
Student s1 = new Student();
s1.id = 5;
s1.name = "kk";
System.out.println("s1id "+s1.id);
System.out.println("s1.name:::::::"+s1.name);
Student s2 = new Student();
s2.id = 6;
s2.name = "ss";
System.out.println("s2.id-------"+s2.id);
System.out.println("s2.name---"+s2.name);
s1 =`s2;

System.out.println("s1id "+s1.id);

System.out.println("s1.name:::::::"+s1.name);
System.out.println("s2.id-------"+s2.id);
System.out.println("s2.name---"+s2.name);

}
}
