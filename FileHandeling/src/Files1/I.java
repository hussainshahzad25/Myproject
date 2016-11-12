package Files1;
import java.io.File;
public class I {

	public static void main(String[] args) {
		
		File f1 = new File("Z:/abc/hello/test");
		System.out.println(f1.mkdir());
		System.out.println("done");
	}
}
//No RTE, only false returned by mkdir(), if drive doesn't exist.
