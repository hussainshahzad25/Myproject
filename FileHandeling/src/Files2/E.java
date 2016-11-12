package Files2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class E {

	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\shahzad\\Downloads\\2012_jaguar_xj_sport-wide.jpg");
		File f2 = new File("2014-jaguar-xf-21_600x0w.jpg");
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		BufferedInputStream bin = null;
		try {
			fin = new FileInputStream(f1);
			bin = new BufferedInputStream(fin);
			byte[] b = new byte[(int)f1.length()];
			bin.read(b);
			
			fout = new FileOutputStream(f2);
			bout = new BufferedOutputStream(fout);
			
			bout.write(b);
			System.out.println("done"); 
 		}catch(IOException e) { e.printStackTrace(); }
	}
}
