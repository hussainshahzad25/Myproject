package Files1;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class W {

	public static void main(String[] args) throws IOException {
		
		FileWriter out = new FileWriter("S-cart");
		BufferedWriter bout = new BufferedWriter(out);
		
		bout.write("Hello to all");
		bout.newLine();
		bout.write("Hello to all");
		bout.newLine();
		bout.write("Hello to all");
		
		bout.flush();
		bout.close();
		
		System.out.println("done");
	}
}
