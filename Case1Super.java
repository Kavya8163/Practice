class Point{
public int x;
private int y;
Point(){
}
Point(int a,int b)
{
x= a;
y=b;
}
int getX(){
return x;
}
int getY()
{
return y;
}
}
class ThreeDPoint extends Point{
private int z;
ThreeDPoint(){
}
ThreeDPoint(int a,int b,int c)
{
super(a,b);
x=a;
y=b;
z=c;
}
int getZ(){
return z;
}
}