package Files1;
import java.io.File;
import java.io.IOException;
public class M {

	public static void main(String[] args) throws IOException {
		
		System.out.println(1);
		
		File f1 = new File("E:/FilesFolder", "abc.doc");
		File f2 = new File("E:/FilesFolder", "test");
		
		System.out.println(f1.createNewFile());
		System.out.println(f2.mkdir());
		
		System.out.println("done");
	}
}
