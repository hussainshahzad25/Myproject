package Files1;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class X {

	public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader("S-cart");
		BufferedReader bin = new BufferedReader(in);
		
		String line = null;
		while((line = bin.readLine()) != null) {
			System.out.println(line);
		}
		
		bin.close();
		in.close();
		System.out.println("done");
	}
}
