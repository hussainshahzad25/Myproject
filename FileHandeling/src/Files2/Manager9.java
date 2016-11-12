package Files2;

import java.io.Serializable;

public class Manager9 {

	public static void main(String[] args) throws Exception {
		
		K k1 = new K();
		k1.x = 40;
		
		System.out.println("-----------------");
		Util.serialize(k1, "test8.txt");
		K k2 = (K)Util.deSerialize("test8.txt");
		System.out.println(k1 == k2);
	}
}
class K implements Serializable {
	
	int x;
	K() {
		System.out.println("K()");
	}
}
