package Files1;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class V {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("done.txt");
		FileReader in = null;
		try {
		    in = new FileReader(f1);
			char [] x = new char[(int)f1.length()];
			in.read(x);
			String s = new String(x);
			System.out.println(s);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				if(in != null) {
					in.close();
					in = null;
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
