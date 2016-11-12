package Files3;
import java.io.Console;
public class Manager11 {

	public static void main(String[] args) {
		
		Console c1 = System.console();
		System.out.println("Enter your password :");
		char x [] = c1.readPassword();
		
		String s = new String(x);
		System.out.println(s);
	}
}

/*
 *  Here we see use of Console class.
 *  Run all console programs through command prompt.
 */
