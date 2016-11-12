package Files2;

import java.io.Serializable;

public class Manager10 {

	public static void main(String[] args) throws Exception {
		
		L obj1 = new L();
		obj1.x = 90;
		Util.serialize(obj1, "test9.txt");
		L obj2 = (L)Util.deSerialize("test9.txt");
		
		System.out.println(obj2.x);
		obj2.x = 100;
		System.out.println(obj1.x);
		obj1.x = 300;
		System.out.println(obj2.x);
	}
}
 class L implements Serializable {
	int x;
 }
/*
   The object brought back through deserialization is new Object and it produces Deep Copying. 
 */
