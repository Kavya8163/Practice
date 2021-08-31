class copyonearrayobjAnotherArray
{
public static void main(String[] args)
{
int a[] = new int[3];
a[0] = 1;
a[1]= 2;
a[2] = 3;
int b[] = new int[a.length];
b[0] = a[0];b[1] = a[1];b[2] = a[2];
for(int i = 0;i<a.length;i++)

b[i] = a[i];
System.out.println("---------------------");
System.out.println(b[0]+","+b[1]+","+b[2]);
}
}