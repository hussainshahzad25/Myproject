package Files3;
import java.io.Externalizable;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Manager7 {

	public static void main(String[] args) throws Exception {
		
		F f1 = new F();
		f1.i = 10;
		f1.j = 20.8;
		F f2 = new F();
		f2.i = 20;
		f2.j = 30.88;
		
		FileOutputStream fout = new FileOutputStream("hello7.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		f1.writeExternal(out);
		f2.writeExternal(out);
		out.flush();
		out.close();
		
		FileInputStream fin = new FileInputStream("hello7.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		F f3 = new F();
		f3.readExternal(in);
		F f4 = new F();
		f4.readExternal(in);
		
		System.out.println(f3.i);
		System.out.println(f3.j);
		System.out.println(f4.i);
		System.out.println(f4.j);
		
	}
}
class F implements Externalizable {
	
	int i;
	double j;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(i);
		out.writeDouble(j);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		i = in.readInt();
		j = in.readDouble();
	}
}
