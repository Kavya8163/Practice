class Employee
{
static String companyname;
}
public class InfoSysApp1
{
public static void main(String[] args)
{
Employee e1,e2,e3;
e1= new Employee();
e2= new Employee();
e3= null;
Employee.companyname= "infoysys";
System.out.println(Employee.companyname);
System.out.println(e1.companyname);
System.out.println(e2.companyname);

System.out.println(e3.companyname);
}
}






