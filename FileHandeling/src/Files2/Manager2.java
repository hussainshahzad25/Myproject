package Files2;
import java.io.IOException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Manager2 {

	public static void main(String[] args) {
		new Manager2().SerializationDemo();
		new Manager2().DeSerializationDemo();
	}
	
	public void SerializationDemo() {
		
		B b1 = new B(10, "abc", true);
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		
		try {
			
			fout = new FileOutputStream("test1.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(b1);
     		
		   }catch(IOException e) {
		     	e.printStackTrace();
	   	     }

		finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
					out = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (fout != null) {
					fout.close();
					fout = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }//end of finally block.
	}//end of method
	
	public void DeSerializationDemo() {
	  
		FileInputStream fin = null;
		ObjectInputStream in = null;
		try {
			fin = new FileInputStream("test1.txt");
			in = new ObjectInputStream(fin);
			B b1 = (B) in.readObject();//this line throws ClassNotFoundException
			System.out.println(b1);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			      try {
				      if(in != null) {
					     in.close();
					     in = null;
				      }
		        	}catch(IOException e) {
				         e.printStackTrace();
			         }
			       try {
				      if(fin != null) {
					    fin.close();
					    fin = null;
				      }
			       }catch(IOException e) {
			        	e.printStackTrace();
			        }
		}// end of finally block.
	}// end of method.
}

class B implements Serializable {
	int i;
	String s1;
	Boolean flag;
	
	 B(int i, String s1, Boolean flag) {
		 this.i = i;
		 this.s1 = s1;
		 this.flag = flag;
	 }
	@Override
	public String toString() {
		return i + "," + s1 + "," + flag;
	}
}