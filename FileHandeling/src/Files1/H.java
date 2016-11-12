package Files1;
import java.io.File;
public class H {

	public static void main(String[] args) {
		
		File f1 = new File("G:/hello");
		
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	
	}
}
