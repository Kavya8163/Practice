
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
	public static void main(String[] args) {
		try
		{
			FileInputStream fin=new FileInputStream("s.txt");
			System.out.println("Enter a byte:");
			int ch =fin.read();
			System.out.println("ch is "+ch);
			System.out.println("ch ="+(char)ch);
			fin.close();
		}
		catch(IOException io)
		{
			System.out.println(io.getMessage());
		}
		
	}

}

