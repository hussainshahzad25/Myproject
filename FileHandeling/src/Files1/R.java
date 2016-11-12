package Files1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class R {

	public static void main(String[] args) throws IOException {
		
		FileWriter out = new FileWriter(new File("temp.txt"));
	
		out.write("hello to all");
		out.write("\nhello to all");
		
		out.flush();
		out.close();
		
		System.out.println("done");
	}
}
