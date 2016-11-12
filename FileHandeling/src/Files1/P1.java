package Files1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P1
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test1.txt");
		FileWriter out = new FileWriter(f1);
		out.write("abc");
		out.write("hello123\n");
		out.write("shahzad");
		out.flush();
		out.close();
		System.out.println("done");
	}

}
