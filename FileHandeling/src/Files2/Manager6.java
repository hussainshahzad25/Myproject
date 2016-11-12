package Files2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Manager6 {

	public static void main(String[] args) throws Exception {
		serialize();
		deSerialize();
	}
	public static void serialize() throws Exception {
		
		H h1 = new H();
		h1.i = 10;
		h1.j = 20;
		FileOutputStream fout = new FileOutputStream("text5.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(h1);
		out.flush();
		out.close();
	}
	public static void deSerialize() throws Exception {
		FileInputStream fin = new FileInputStream("text5.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		H h1 = (H) in.readObject();
		System.out.println(h1.i);
		System.out.println(h1.j);
	}
}
class G implements Serializable {
	int i;
}
class H extends G {
	int j;
}
//If superclass is Serializable then subclass is also serializable.