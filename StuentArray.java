class Student
{
int id;
String name;
}
public class StuentArray
{
public static void main(String[] args)
{

Student a[] = new Student[3];
System.out.println("3student references ---------------------------");
System.out.println(a);
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
a[0] = new Student();
a[1] = new Student();

a[2] = new Student();
a[0].id=1;
a[0].name="kavya";
a[1].id=2;
a[1].name="kk";



a[2].id=3;
a[2].name="kav";
System.out.println("3student obj ---------------------------");
System.out.println(a);
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);

System.out.println("Accessing eles using loops ---------------------------");
for(int i = 0;i<a.length;i++)
{
System.out.println(a[i].id);
System.out.println(a[i].name);
}

for(Student e:a)
{
System.out.println(e.id);
System.out.println(e.name);
}
}
}










