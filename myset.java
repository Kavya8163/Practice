

class Student{
private int rollnum;
private String name;
public Student(){
}
public Student(int r,string n){
rollnum = r;
name =n;
}

class Employee 
{
private int id;
private String name;
private String department;}
public Employee()
{
	
}
public Employee(int id,String n,String d)
{
	id =i;
	name = n;
	department = d;
	
}
public int getId(){return  id;}
public int getName(){return  name;}
public int getDepartment(){return  department;}
}
class Myset{
	private Object elements[] = new Object[10];//Elements default capacity:10
	private int index = 0;
	public void add(Object ele)
	{
		elements[index]= ele;
		index++;
	}
	public String toString()
	{
		String elementsString="";
		for(int i = 0;i<index;i++)
		{
			elementsString= elementsString + elements[i].toString+",";
		}
		elementsString= elementsString+"\b]";
	}
}


public class myset{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1,"kavya","google");
		Employee e2 = new Employee(2,"navya","noogle");
		Employee e3 = new Employee(3,"savya","soogle");
		Employee e4 = new Employee(4,"bavya","boogle");
		
		Student s1 = new Student(5,"sasi");
		Student s2 = new Student(5,"jag");
		Student s3 = new Student(5,"jp");
		Student s4 = new Student(5,"johnson");
		Student s5 = new Student(5,"sola");
		MySet studentSet = new MySet();
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		System.out.println(studentSet);
		
		
		
		
	}
}



