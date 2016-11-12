package Files1;
import java.io.File;

public class G {
	 public static void main(String[] args) {
		
		 File f1 = new File("abc");
		 
		 boolean b1 = f1.mkdir();
		 
		 System.out.println(b1);
		 
		 System.out.println("done");
	}
}
/*
unlike createNewFile() , mkdir() doesn't throw any error
*/