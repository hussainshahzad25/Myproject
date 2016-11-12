package Files2;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Manager3 {
		public static void main(String[] args) throws Exception {
			C c1 = new C(90, 200.90);
			System.out.println("Before Serial. :" + c1);
			serializeObject(c1);
			C c2 = (C)deSerializeObject();
			System.out.println("After Serial. :" + c2);
		}
		private static void serializeObject(C c1) throws Exception {
			FileOutputStream fout = new FileOutputStream("test2.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(c1);
			out.flush();
			out.close();
		}
		private static Object deSerializeObject() throws Exception {
			
			FileInputStream fin = new FileInputStream("test2.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			 Object obj =  in.readObject();
			 in.close();
			 return obj;
		}
}
class C implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int i;
	transient double j;
	
	C(int i, double j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "i = " + i + ", j = " + j;
	}
 }
//Transient variable are not saved during serialization and come back as default values during deserialization.
