package Files3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Manager3 {
    
	public static void main(String[] args) throws Exception {
		externalize();
		deExternalize();
	}
	public static void externalize() throws Exception {
		
		C c1 = new C();
		c1.i = 10;
		c1.j = 20.86;
		c1.s1 = "abc";
		FileOutputStream fout = new FileOutputStream("hello3.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeUTF(c1.s1);
		out.writeInt(c1.i);
		
		out.flush();
		out.close();
		System.out.println("done");
	}
	
	public static void deExternalize() throws Exception {
		
		FileInputStream fin = new FileInputStream("hello3.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		String s = in.readUTF();
		int i = in.readInt();
		//Order matters, it must be retrieved in same order in which they were added or Gargabe value is displayed.
		
		System.out.println(i + " " + s);
	}
}

class C implements Serializable {
	int i;
	double j;
	String s1;
}
