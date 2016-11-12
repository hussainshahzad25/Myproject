package Files1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C1
{
	public static void main(String[] args)
	{
		FileWriter out = null;
		BufferedWriter bout =null;
		try
		{
			out  = new FileWriter("test1.txt");
			bout= new BufferedWriter(out);
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(bout != null){
					bout.flush();
					bout.close();
					bout=null;
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(out != null)
				{
					out.close();
					out=null;
				}
			}
			catch(IOException ex)
			{
			System.out.println(ex);
			}
		}
		System.out.println("done");
	}
}
