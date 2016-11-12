package Files3;

import java.io.PrintStream;

public class Manager15 {

	public static void main(String[] args) throws Exception {
		
		PrintStream p1 = System.out;
		PrintStream p2 = new PrintStream("MyLog.log");
		
		System.out.println(1);
		p1.println(2);
		p2.println(3);
		
		System.setOut(p2);
		System.out.println(4);
		
		p1.println(5);
		p1.println(6);
		
		System.setOut(p1);
		System.out.println(7);
	    
		p1.println(8);
		p1.println(9);
	}
}
