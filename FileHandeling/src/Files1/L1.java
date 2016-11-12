package Files1;

import java.io.File;
import java.util.Properties;

public class L1
{
	public static void main(String[] args)
	{/*
		File f1 = new File("abc");
		f1.mkdir();
		File f2 = new File(f1,"abc");
		System.out.println(f2.mkdir());*/
		Properties p = System.getProperties();
		p.list(System.out);
		
	}
}
