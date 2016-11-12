package Files1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("hello.txt");
		
		FileWriter out = new FileWriter(f1);
		
		out.write("abc");
		out.write("\n");
		out.write("abc");
		out.write("123");
		out.write("\n");
		out.write("abc");
		out.write("123\ndone");
		
		out.flush();
		out.close();
		
		
		System.out.println("done");
	}
}
