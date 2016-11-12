package Files1;

import java.io.FileWriter;
import java.io.IOException;

public class U {
	
	public static void main(String[] args) {
		
		FileWriter out = null;
		
		try {
			  out = new FileWriter("done.txt");//Here no File object created.
			  out.write("hello123\njava and");
			  System.out.println("done");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
			     	if(out != null) { 
				     	out.flush();
					    out.close();
					    out = null;
				      }
			}catch(IOException e) {
					e.printStackTrace();
				
			}
		}//end of finally
	}
}
