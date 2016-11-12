package Files1;

import java.io.File;
import java.io.IOException;

public class A1
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/test.txt");
		try
		{
			System.out.println(f1.createNewFile());
		}
		catch(IOException ex)
		{
			//System.out.println(ex);
			ex.printStackTrace();
		}
	}
}
