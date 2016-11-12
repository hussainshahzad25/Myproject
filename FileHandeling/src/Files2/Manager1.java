package Files2;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;
public class Manager1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		new Manager1().doSerialization();
		new Manager1().doDeSerialization();
	}
	public void doSerialization() throws IOException {
		
		A a1 = new A();
		a1.i = 10;
		a1.j = 20.34;
		
		FileOutputStream fout = new FileOutputStream("test.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		
		System.out.println("Object wrote into file");
	}
	public void doDeSerialization() throws IOException, ClassNotFoundException {
		
		FileInputStream fin = new FileInputStream("test.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		A a1 = (A)in.readObject();
		
		System.out.println(a1.i + " " + a1.j);
	}
}

class A implements Serializable {

 	int i;
	double j;
}
