package Files1;

import java.io.File;
import java.io.IOException;

public class J {

	public static void main(String[] args) {
		
		File f1 = new File("abc");
		File f2 = new File(f1, "hello.txt");
		
		try {
			System.out.println(f2.createNewFile());
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("done!");
	}
}
//here abc directory must exist, or first f1.mkdir() then create f2.createNewFile()!!
