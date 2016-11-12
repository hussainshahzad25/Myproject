package Files3;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Manager5 {

	public static void main(String[] args) throws Exception {
		
		externalize();
		deExternalizable();
	}
	public static void externalize() throws Exception {
		
		D d1 = new D();
		d1.i = 1000;
		d1.s1 = "abc";
		d1.j = 4504.908;
		
		FileOutputStream fout = new FileOutputStream("hello5.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		d1.writeExternal(out);
		
		out.flush();
		out.close();
	}
	
	public static void deExternalizable() throws Exception {
		
		D d1 = new D();
		
		FileInputStream fin = new FileInputStream("hello5.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		d1.readExternal(in);
		
		System.out.println(d1.i);
		System.out.println(d1.s1);
		System.out.println(d1.j);
	}
}
class D implements Externalizable {
	
	    int i;
	    String s1;
	    double j;
	    
	  @Override
      public void writeExternal(ObjectOutput out) throws IOException {
    	   
		  out.writeInt(i);
		  out.writeUTF(s1);
		  out.writeDouble(j);
      }
	
	  @Override
      public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    	  
		  i = in.readInt();
		  s1 = in.readUTF();
		  j = in.readDouble();
      }
}
