package Files3;
import java.io.Externalizable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;
public class Manager8 {

	public static void main(String[] args) throws Exception {
		
		externalize();
		deExternalize();
	}
	
	public static void externalize() throws Exception {
		
		Person p1 = new Person();
		p1.name = "vijay";
		p1.age = 22;
		p1.weight = 45.909;
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		
		try {
			fout = new FileOutputStream("hello8.txt");
			out = new ObjectOutputStream(fout);
			p1.writeExternal(out);
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				  if(out != null) 
					  out.flush();
					  out.close();
					  out = null;
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(fout != null) {
					fout.close();
					fout = null;
				}
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		}//end of finally.
	}
	
	public static void deExternalize() {
		
		Person p2 = new Person();
		FileInputStream fin = null;
		ObjectInputStream in = null;
		try {
			fin = new FileInputStream("hello8.txt");
			in = new ObjectInputStream(fin);
			p2.readExternal(in);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
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
		}//end of finally.
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.weight);
	}
}
class Person implements Externalizable {
	
	String name;
	int age;
	double weight;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeUTF(name);
		out.writeInt(age);
		out.writeDouble(weight);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = in.readUTF();
		age = in.readInt();
		weight = in.readDouble();
	}
}
