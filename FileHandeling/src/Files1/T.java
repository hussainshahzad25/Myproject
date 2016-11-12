package Files1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T {

	public static void main(String[] args) 
	throws FileNotFoundException, IOException 
	{		
		FileReader in = new FileReader(new File("G:\\FilesFolder\\test.txt"));
		char [] x = new char[7];//only 7 characters will be read from file no RTE.
		
		in.read(x);
	    
		in.close();
		String s = new String(x);
		System.out.println(s);
	}
}
/*
File represents a file on the disk.
FileWriter works with characters and writes characters to the file on disk.
BufferedWriter/Reader is for efficent writing and reading.
*/