package Files3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Manager4 {

   public static void main(String[] args) throws Exception {
	
	   FileOutputStream fout = new FileOutputStream("hello4.txt");
	   ObjectOutputStream out = new ObjectOutputStream(fout);
	   
	   out.writeInt(100);
	   out.writeDouble(34.9090);
	   out.writeUTF("xyz");
	   out.flush();
	   out.close();
	   System.out.println("done writing");
	   
	   FileInputStream fin = new FileInputStream("hello4.txt");
	   ObjectInputStream in = new ObjectInputStream(fin);
	   
	   System.out.println(in.readInt());
	   System.out.println(in.readDouble());
	   System.out.println(in.readUTF());
	
	 
	   System.out.println();
   }
}
