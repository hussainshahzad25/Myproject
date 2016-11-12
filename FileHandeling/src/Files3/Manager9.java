package Files3;
import java.io.Console;
public class Manager9 {

	public static void main(String[] args) {
		
		Console c1 = System.console();
		System.out.println(c1);
	}
}
/*
  1.) When we start JVM through interactive command window, one console object is created by JVM
      and that object can be retrieved through System.console() method.
      If we start JVM through eclipse no console object is created.
      
  2.) java.io.Console; was introduced in JAVA 1.6.
  
*/