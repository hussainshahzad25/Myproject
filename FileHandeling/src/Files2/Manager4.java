package Files2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Manager4 {

	public static void main(String[] args) throws Exception {
		
		serialize();
		deSerialize();
	}
	public static void serialize() throws Exception {
		D d1 = new D();
		d1.i = 10;
		D.j = 20;
		FileOutputStream fout = new FileOutputStream("test3.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(d1);
		out.flush();
		out.close();
	}
	
	public static void deSerialize() throws Exception {
 		FileInputStream fin = new FileInputStream("test3.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		D d2 = (D) in.readObject();
		
		System.out.println(d2.i);
		System.out.println(d2.j);
	}
}
class D implements Serializable {
	int i;
	static int j;
}
//static variables are not serialized.