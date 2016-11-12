package Files3;
import java.io.Console;
public class Manager10 {

	public static void main(String[] args) {
		
		Console c1 = System.console();
		Console c2 = System.console();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
	}
}
//Only one console object is created by JVM through interactive command window.
