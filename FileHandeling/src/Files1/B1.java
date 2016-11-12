package Files1;

import java.io.File;
import java.io.IOException;

public class B1
{
	public static void main(String[] args)
	{
		File f1 = new File("F:/lab");
		f1.mkdir();
		File f2 = new File(f1,"hello.txt");
		try
		{
			System.out.println(f1.createNewFile());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
