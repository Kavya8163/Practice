public class ArraySum
{
static void printSum(int a[])
{
int s= 0; 
for(int i = 0;i<a.length;i++)
s= s+a[i];
}
System.out.println("sum is "+s);
}

public static void main(String[] args)
{
int b[] ={1,2,3};
printSum(b);
}
}
