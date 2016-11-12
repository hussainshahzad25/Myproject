package Files1;

import java.io.File;
import java.io.IOException;

public class K {

	public static void main(String[] args) {
		
		File f1 = new File("E:/FilesFolder");
		File f2 = new File(f1, "test.txt");
		
		try {
			System.out.println(f1.mkdir());
			System.out.println(f2.createNewFile());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
}
