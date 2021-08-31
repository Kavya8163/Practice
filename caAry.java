class caAry
{
public static void main(String[] args)
{
int a[] = new int[3];
a[0] = 1;
a[1]= 2;
a[2] = 3;
int b[] = new int[3];
b[0] = 5;b[1] = 6;b[2] = 7;
System.out.println(b[0]+","+b[1]+","+b[2]);

for(int i = 0;i<a.length;i++)

System.out.println(a[i]);
for(int i = 0;i<b.length;i++)
b=a;

System.out.println("---------------------");
System.out.println(a[0]+","+a[1]+","+a[2]);
System.out.println(b[0]+","+b[1]+","+b[2]);
}
}