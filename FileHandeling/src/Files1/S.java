package Files1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
		File f1 = new File("temp.txt");
		FileReader in = new FileReader(f1);
		
		long size = f1.length();
		
		char [] x = new char[(int)size];
		in.read(x);
		
		in.close();
		
		String s = new String(x);
		System.out.println(s);
	}
}


/*
 * 1.) Array size is in ints.
 * 2.) file.length() returns a long value.
 */
