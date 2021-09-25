

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo3
{
	public static void main(String[] args) {
		try
		{
			FileInputStream fin=new FileInputStream("con");
                        byte b[] = {'k','a','v','y','a'};
 
			System.out.println("value in byte Array b is:");
			for(int i =0;i<b.length;i++)
			System.out.println((char)b[i]);
                       System.out.println("\nEnter3 bytes:");
                        fin.read(b,0,3);
			  System.out.println("After reading input into byte Array b the value in byte Array b is :");
for(int i =0;i<b.length;i++)
			System.out.println((char)b[i]);
fin.close();
		}
		catch(IOException io)
		{
			System.out.println(io.getMessage());
		}
		
	}

}


