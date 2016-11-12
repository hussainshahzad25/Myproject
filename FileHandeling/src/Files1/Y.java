package Files1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Y 
{
	public static void main(String[] args) 
	{		
		FileWriter out = null;
		BufferedWriter bout = null;
		try 
		{
			out = new FileWriter("sample.doc");
			bout = new BufferedWriter(out);
			bout.write("I love Jammie");
			bout.newLine();
			bout.write("Shahzad as a ");
			bout.newLine();
			bout.write("Computer Programmer");			
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if(bout != null) 
				{
					bout.flush();
					bout.close();
					bout = null;
				}
			}
			catch(IOException e)
			{
				e.printStackTrace(); 
			}			
			try 
			{
				if(out != null) 
				{
					out.close();
					out = null;
				}
			}
			catch(IOException e) 
			{
				e.printStackTrace();
			}
		}		
		System.out.println("done");
	}
}
