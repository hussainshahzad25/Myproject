package Files1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class S1
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test1.txt");
		FileReader in = new FileReader(f1);
		long size = f1.length();
		char[] x = new char[(int)size];
		in.read(x);
		//in.close();
		String s1 = new String(x);
		System.out.println(s1);
	}
}
