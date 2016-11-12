package Files3;

import java.io.PrintStream;

public class Manager14 {

	public static void main(String[] args) throws Exception {
		
		PrintStream p1 = new PrintStream("hello.txt");
		
		p1.println("hi");
		p1.println("what are you doing");
		
		System.out.println("testing1");
		
		System.setOut(p1);
		
		System.out.println("testing2");
		System.out.println("testing3");
	}
}
