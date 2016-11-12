package Files1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Z {

	 public static void main(String[] args) {
		
		 File f1 = new File("sample.doc");
		 FileReader in = null;
		 BufferedReader bin = null;
		 try {
			 in = new FileReader(f1);
			 bin = new BufferedReader(in);
			 
			 String line = null;
			 while((line = bin.readLine()) != null) {
				 System.out.println(line);
			 }
		 }catch(IOException e) { e.printStackTrace();}
		 
		 finally {
			 try {
				 if(bin != null) {
					 bin.close();
					 bin = null;
				 }
			 }catch(IOException e) {e.printStackTrace();}
			 
			 try {
				 if(in != null) {
					 in.close();
					 in = null;
				 }
			 }catch(IOException e) {e.printStackTrace();}
		 }
	}
}
