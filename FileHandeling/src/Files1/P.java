package Files1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class P {

	public static void main(String[] args) throws IOException {
		
		File file = new File("test.txt");//automatically creates test.txt no file.createNewFile() needed.
		
		FileWriter out = new FileWriter(file);
		
		out.write("abc");
		out.write("hello123");
		out.write("test");
		
		out.flush();
		out.close();
		
		System.out.println("done");
	}
}
