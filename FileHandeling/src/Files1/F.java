package Files1;
import java.io.File;
import java.io.IOException;
public class F {

	public static void main(String[] args) {
		
		File f1 = new File("Z:\\hello.txt");
		
		try {
			 System.out.println(1);
			 System.out.println(f1.createNewFile());
			 System.out.println(2);
		}catch(IOException e) {
			 System.out.println(e);
		}
		
		System.out.println("done");
	}//RTE
}
