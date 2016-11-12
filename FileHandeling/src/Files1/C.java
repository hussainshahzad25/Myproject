package Files1;

import java.io.File;
import java.io.IOException;

public class C {

	public static void main(String[] args) {
		
		File f1 = new File("resume.doc");
		
		try {
		 System.out.println(f1.createNewFile());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
}
