package Files1;
import java.io.File;
import java.io.IOException;
public class A {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("abc.txt");
		 
		boolean b1 = f1.createNewFile();
		
		System.out.println(b1);
		System.out.println("done!");
	}
}
