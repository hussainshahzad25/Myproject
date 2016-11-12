package Files1;

import java.io.File;
import java.io.IOException;

public class L {

	public static void main(String[] args) {
		
		File f1 = new File("E:/FilesFolder");
		File f2 = new File(f1, "abc");		
		System.out.println(f2.mkdir());
		File f3 = new File(f2,"abc.txt");
		try
		{
			System.out.println(f3.createNewFile());
		}catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}
