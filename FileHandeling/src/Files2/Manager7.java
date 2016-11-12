package Files2;

import java.io.Serializable;

public class Manager7 {

	public static void main(String[] args) throws Exception {
		
		I obj = new I();
		obj.x = 100;
		
		Util.serialize(obj, "test6.txt");
		System.out.println("-------------------");
		I obj1 = (I) Util.deSerialize("test6.txt");
		System.out.println(obj1.x);
		
	}
}

 class I implements Serializable {
	
	int x;
 }

