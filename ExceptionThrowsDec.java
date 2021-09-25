import java.io.*;
class ExceptionThrowsDec
{
void m(int a)throws EOFException,Exception{
if(a==0)
throw new Exception(""+a);
if(a==1)
throw new EOFException(""+a);
}
}
