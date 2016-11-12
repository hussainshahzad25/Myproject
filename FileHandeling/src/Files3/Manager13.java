package Files3;

import java.io.PrintStream;

public class Manager13 {

	public static void main(String[] args) throws Exception {
		
		PrintStream p1 = new PrintStream("test.log");
		System.out.println(100);
		System.setOut(p1);
		System.out.println(200);
	}
}
