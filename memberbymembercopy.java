class Student
{
int id;
String name;
}
public class memberbymembercopy
{
public static void main(String[] args)
{
Student s1 = new Student();
Student s2 = new Student();
s1.id = 5;
s1.name = "satya";
s2.id = 6;
s2.name= "vani";
System.out.println(s1.id);
System.out.println(s1.name);
System.out.println(s2.id);
System.out.println(s2.name);
s1.id=s2.id;
s1.name=s2.name;
System.out.println("**************After Assign**************");
System.out.println(s1.id);
 System.out.println(s1.name);
System.out.println(s2.id);
System.out.println(s2.name);
}
}