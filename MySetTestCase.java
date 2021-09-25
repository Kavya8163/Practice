class Student{
private int id;
private String name;
public Student() {
}
public Student(int r,String n){
id=r;
name=n;
}
public int getId(){
return id;
}
public String getName(){
return  name;
}
public String toString(){
return "("+id+","+name+")";
}
public boolean equals(Object obj) {
                Student param=(Student)obj;
                return this.id==param.id&& this.name.equals(param.name);
}
}
class Employee{
private int id;
private String name;
private String department;
public Employee(){
}
public Employee(int i,String n,String d){
id=i;
name=n;
department=d;
}
public int getId(){ return id;}
public String getName() { return name; }
public String getDepartment() { return department;}
public String toString(){
                return "("+id+","+name+","+department+")";
}
public boolean equals(Object obj) {
                Employee param=(Employee)obj;
                return this.id==param.id&& this.name.equals(param.name)&&this.department.equals(param.department);
}
}
class MySet{
private Object element[] =new Object[10];
private int index=0;
public void add(Object ele){
                for(int i=0;i<index;i++) {
                                if(element[i]==ele);
                }
element[index] =ele;
index++;
}

public String toString(){
String elementsString="[";
for(int i=0;i<index;i++){
                elementsString=elementsString +element[i].toString()+",";
}
                elementsString =elementsString+"\b]";
                //return elementsString;

}
}
public class MySetTestCase{
                public static void main(String [] args){
                                Employee e1=new Employee(1,"tony","tark industries");
                                Employee e2=new Employee(2,"capitanamerica","USA");
                                Employee e3=new Employee(3,"peter","spider");
                                Employee e4=new Employee(1,"tony","tark industries");
                                
                                Student s1=new Student(5,"Kavya");
                                Student s2=new Student(6,"Nandhu");
                                Student s3=new Student(7,"Bhanu");
                                Student s4=new Student(8,"sandeep");
                                Student s5=new Student(5,"Kavya");
								
                                MySet studentset =new MySet();
                                studentset.add(s1);
                                studentset.add(s2);
                                studentset.add(s3);
                                studentset.add(s4);
                                studentset.add(s5);
                                System.out.println(studentset);
								
                                MySet employeeset=new MySet();
                                employeeset.add(e1);
                                employeeset.add(e2);
                                employeeset.add(e3);
                                employeeset.add(e4);
                                System.out.println(employeeset);
								
                                System.out.println(s1==s2);
                                System.out.println(s1.equals(s2));
                                System.out.println(s1==s3);
                                System.out.println(s1.equals(s3));
                                System.out.println(s1==s4);
                                System.out.println(s1.equals(s4));
                                System.out.println(s1==s5);
                                System.out.println(s1.equals(s5));
                                System.out.println("...................");
                                System.out.println(e1==e2);
                                System.out.println(e1.equals(e2));
                                System.out.println(e1==e3);
                                System.out.println(e1.equals(e3));
                                System.out.println(e1==e4);
                                System.out.println(e1.equals(e4));
                                
                }
}



                                
                                
