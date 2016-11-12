package Files3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
class A implements Serializable
{	
	int i;
	double j;
}
public class Manager1 
{
	public static void main(String[] args) throws Exception 
	{		
		A a1 = new A();
		a1.i = 10;
		a1.j = 40.8;		
		FileOutputStream fout = new FileOutputStream("hello1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeInt(a1.i);
		out.writeDouble(a1.j);
		out.flush();
		out.close();
		System.out.println("writing is done");
		
		FileInputStream fin = new FileInputStream("hello1.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		int p  = in.readInt();
		double q = in.readDouble();
		System.out.println("After reading");
		System.out.println(p);
		System.out.println(q);
	}
}