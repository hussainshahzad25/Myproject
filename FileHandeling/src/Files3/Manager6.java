package Files3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Manager6 {
 
	public static void main(String[] args) throws Exception {
		
		E e1 = new E();
		e1.i = 10;
		e1.j = 20.8;
		
		E e2 = new E();
		e2.i = 200;
		e2.j = 300.9;
		
		FileOutputStream fout = new FileOutputStream("hello6.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeInt(e1.i);
		out.writeDouble(e1.j);
		out.writeInt(e2.i);
		out.writeDouble(e2.j);
		out.flush();
		out.close();
		
		FileInputStream fin = new FileInputStream("hello6.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		    
		int i = in.readInt();
		double j = in.readDouble();
		int p = in.readInt();
		double q = in.readDouble();
		
		System.out.println(i + "," + j + "\n" + p + "," + q);
	}
}
class E implements Serializable {
	
	int i;
	double j;
}
