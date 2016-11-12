package Files1;
import java.io.File;
public class O {

	public static void main(String[] args) {
		
		File f1 = new File("abc");
		File f2 = new File("abc/hello.txt");
		
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
	}
}
