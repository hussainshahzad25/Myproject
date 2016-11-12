package Files2;

import java.io.Serializable;

public class Manager8 {

	public static void main(String[] args) throws Exception {
		
		J j1 = new J();
		j1.x = 100;
		Util.serialize(j1, "test7.txt");
		System.out.println("-------------------");
		J j2 = (J) Util.deSerialize("test7.txt");
		System.out.println(j2.x);
	}
}
class J implements Serializable {
	int x;
	J() {
		System.out.println("J()");
	}
}

//If J doesn't implement Serializable then java.io.NotSerializableException is thrown.RTE
/*
  Serialized Objects Constructors doesn't run when object is brought back.
  If object has any non-serialized class somewhere up the inheritance tree
  the constructors for that class will run.(along with any constructors above
  that even if they are serialized class).
*/